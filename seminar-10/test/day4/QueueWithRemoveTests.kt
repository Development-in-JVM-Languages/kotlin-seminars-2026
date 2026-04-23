package day4

import AbstractQueueTest
import org.jetbrains.lincheck.datastructures.*

class MSQueueWithLinearTimeRemoveTest : AbstractQueueWithRemoveTest(MSQueueWithLinearTimeRemove())
class MSQueueWithConstantTimeRemoveTest : AbstractQueueWithRemoveTest(MSQueueWithConstantTimeRemove())

abstract class AbstractQueueWithRemoveTest(
    private val queue: QueueWithRemove<Int>,
    checkObstructionFreedom: Boolean = true,
) : AbstractQueueTest(
    queue = queue, checkObstructionFreedom = checkObstructionFreedom, threads = 3, actorsBefore = 4
) {
    @Operation
    fun remove(@Param(name = "element") element: Int) = queue.remove(element)
}