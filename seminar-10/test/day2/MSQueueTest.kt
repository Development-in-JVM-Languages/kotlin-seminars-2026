package day2

import org.jetbrains.lincheck.datastructures.*
import org.junit.Test

class MSQueueTest {
    val q = MSQueue<Int>()

    @Operation
    fun enqueue(e: Int) = q.enqueue(e)

    @Operation
    fun dequeue() = q.dequeue()

    @Validate
    fun verify() = q.validate()

    @Test
    fun test() = ModelCheckingOptions()
        .check(this::class)
}