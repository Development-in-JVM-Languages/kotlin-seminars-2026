@file:Suppress("unused")

package day1

import TestBase
import org.jetbrains.lincheck.datastructures.*
import org.junit.*
import org.junit.runners.*
import kotlin.concurrent.*

class TreiberStackTest : StackTest(TreiberStack())

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TreiberStackWithEliminationTest : StackTest(TreiberStackWithElimination()) {

    @Test // override this function so JUnit sorts the tests correctly
    override fun modelCheckingTest() = super.modelCheckingTest()

    @Test // override this function so JUnit sorts the tests correctly
    override fun stressTest() = super.stressTest()

    @Test
    fun testEliminationIsUsed() {
        var eliminationUsed = false
        val s = object : TreiberStackWithElimination<Int>() {
            override fun tryPushElimination(element: Int): Boolean {
                return super.tryPushElimination(element).also {
                    if (it) eliminationUsed = true
                }
            }
        }
        runParallelPushAndPopOperations(s)
        check(eliminationUsed) {
            "The elimination optimization has not been used"
        }
        eliminationUsed = false
        runParallelPushAndPopOperations(s)
        check(eliminationUsed) {
            "The elimination was used during the first execution " +
                    "but has not been used during the second one. " +
                    "Probably, you clean the array slots incorrectly."
        }
    }

    private fun runParallelPushAndPopOperations(s: TreiberStackWithElimination<Int>) {
        (1..4).map {
            thread {
                repeat(1_000_000) {
                    s.push(it)
                    s.pop()
                }
            }
        }.forEach { it.join() }
    }
}

abstract class StackTest(
    private val stack: Stack<Int>
) : TestBase(sequentialSpecification = IntStackSequential::class) {
    @Operation
    fun push(element: Int) = stack.push(element)

    @Operation
    fun pop() = stack.pop()
}

class IntStackSequential {
    private val q = ArrayDeque<Int>()

    fun push(element: Int) {
        q.addLast(element)
    }

    fun pop(): Int? = q.removeLastOrNull()
}