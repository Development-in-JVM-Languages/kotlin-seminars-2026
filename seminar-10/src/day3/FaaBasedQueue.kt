package day3

import day2.*
import java.util.concurrent.atomic.*

class FAABasedQueue<E> : Queue<E> {

    override fun enqueue(element: E) {
        TODO("Implement me!")
    }

    @Suppress("UNCHECKED_CAST")
    override fun dequeue(): E {
        TODO("Implement me!")
    }
}

private class Segment(val id: Long) {
    val next = AtomicReference<Segment?>(null)
    val cells = AtomicReferenceArray<Any?>(SEGMENT_SIZE)
}

// DO NOT CHANGE THIS CONSTANT
private const val SEGMENT_SIZE = 2