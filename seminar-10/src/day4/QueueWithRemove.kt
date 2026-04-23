package day4

import day2.*

interface QueueWithRemove<E> : Queue<E> {
    /**
     * Removes the first occurrence of the specified [element].
     * Returns `true` if the element was removed; `false` otherwise.
     */
    fun remove(element: E): Boolean
}