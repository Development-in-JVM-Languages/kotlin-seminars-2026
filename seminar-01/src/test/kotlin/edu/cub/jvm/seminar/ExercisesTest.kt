package edu.cub.jvm.seminar

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ExercisesTest {
    // isPalindrome tests
    @Test
    fun `isPalindrome - basic words`() {
        assertTrue(isPalindrome("racecar"))
        assertTrue(isPalindrome("level"))
        assertFalse(isPalindrome("hello"))
    }

    @Test
    fun `isPalindrome - mixed case and punctuation`() {
        assertTrue(isPalindrome("RaceCar")) // Case insensitive
        assertTrue(isPalindrome("A man, a plan, a canal: Panama")) // Ignore punctuation
    }

    @Test
    fun `isPalindrome - empty and single char`() {
        assertTrue(isPalindrome(""))
        assertTrue(isPalindrome("a"))
    }

    @Test
    fun `isPalindrome - numbers and letters`() {
        assertTrue(isPalindrome("A1B2B1A"))
        assertTrue(isPalindrome("No 'x' in Nixon"))
    }

    // sumOfEvenSquares tests
    @Test
    fun `sumOfEvenSquares - mixed numbers`() {
        assertEquals(20, sumOfEvenSquares(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `sumOfEvenSquares - no evens`() {
        assertEquals(0, sumOfEvenSquares(listOf(1, 3, 5, 7)))
    }

    @Test
    fun `sumOfEvenSquares - negative numbers`() {
        assertEquals(20, sumOfEvenSquares(listOf(-1, -2, -3, -4)))
    }

    @Test
    fun `sumOfEvenSquares - empty list`() {
        assertEquals(0, sumOfEvenSquares(emptyList()))
    }

    // areAnagrams tests
    @Test
    fun `areAnagrams - valid anagrams`() {
        assertTrue(areAnagrams("listen", "silent"))
        assertTrue(areAnagrams("evil", "vile"))
    }

    @Test
    fun `areAnagrams - different lengths`() {
        assertFalse(areAnagrams("hi", "hello"))
    }

    @Test
    fun `areAnagrams - same letters different counts`() {
        assertFalse(areAnagrams("aabb", "ab"))
    }

    @Test
    fun `areAnagrams - empty strings`() {
        assertTrue(areAnagrams("", ""))
    }

    @Test
    fun `areAnagrams - case sensitive`() {
        assertFalse(areAnagrams("Listen", "silent"))
    }

    // findSecondLargest tests
    @Test
    fun `findSecondLargest - standard list`() {
        assertEquals(20, findSecondLargest(listOf(10, 20, 30)))
    }

    @Test
    fun `findSecondLargest - unsorted list with duplicates`() {
        // Unique: 5, 10, 20. Second largest: 10
        assertEquals(10, findSecondLargest(listOf(5, 20, 10, 20, 5)))
    }

    @Test
    fun `findSecondLargest - not enough elements`() {
        assertNull(findSecondLargest(listOf(1)))
        assertNull(findSecondLargest(emptyList()))
    }

    @Test
    fun `findSecondLargest - all elements identical`() {
        assertNull(findSecondLargest(listOf(5, 5, 5)))
    }

    // countWordFrequencies tests
    @Test
    fun `countWordFrequencies - standard`() {
        val input = listOf("kotlin", "java", "kotlin", "cpp", "java", "kotlin")
        val result = countWordFrequencies(input)

        assertEquals(3, result["kotlin"])
        assertEquals(2, result["java"])
        assertEquals(1, result["cpp"])
    }

    @Test
    fun `countWordFrequencies - empty list`() {
        val result = countWordFrequencies(emptyList())
        assertTrue(result.isEmpty())
    }

    // groupByFirstLetter tests
    @Test
    fun `groupByFirstLetter - standard`() {
        val input = listOf("Apple", "Banana", "Apricot", "Cherry")
        val result = groupByFirstLetter(input)

        assertEquals(listOf("Apple", "Apricot"), result['A'])
        assertEquals(listOf("Banana"), result['B'])
        assertEquals(listOf("Cherry"), result['C'])
    }

    @Test
    fun `groupByFirstLetter - empty list`() {
        val result = groupByFirstLetter(emptyList())
        assertTrue(result.isEmpty())
    }

    // calculateMovingAverage tests
    @Test
    fun `calculateMovingAverage - standard case`() {
        val input = listOf(1, 2, 3, 4, 5)
        val result = calculateMovingAverage(input)
        assertEquals(listOf(2.0, 3.0, 4.0), result)
    }

    @Test
    fun `calculateMovingAverage - exact window size`() {
        val input = listOf(1, 2, 3)
        val result = calculateMovingAverage(input)
        assertEquals(listOf(2.0), result)
    }

    @Test
    fun `calculateMovingAverage - less than window size`() {
        val input = listOf(1, 2)
        val result = calculateMovingAverage(input)
        assertTrue(result.isEmpty())
    }

    @Test
    fun `calculateMovingAverage - empty list`() {
        val result = calculateMovingAverage(emptyList())
        assertTrue(result.isEmpty())
    }

    // findKLargest tests
    @Test
    fun `findKLargest - standard`() {
        val input = listOf(50, 10, 40, 20, 30)
        assertEquals(listOf(50, 40, 30), findLargest(input, 3))
    }

    @Test
    fun `findKLargest - k larger than list`() {
        val input = listOf(1, 2, 3)
        assertEquals(listOf(3, 2, 1), findLargest(input, 10))
    }

    @Test
    fun `findKLargest - with duplicates`() {
        val input = listOf(10, 5, 20, 5, 20)
        assertEquals(listOf(20, 20, 10), findLargest(input, 3))
    }

    @Test
    fun `findKLargest - k equals zero`() {
        val input = listOf(1, 2, 3)
        assertEquals(emptyList<Int>(), findLargest(input, 0))
    }
}
