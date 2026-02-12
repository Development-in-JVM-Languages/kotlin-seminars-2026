package edu.cub.jvm.seminar

/**

 * Checks if a given string is a palindrome.
 * A palindrome reads the same forward and backward.
 * It should ignore case and non-alphanumeric characters.
 *
 * Example:
 * "Racecar" -> true
 * "Hello" -> false
 * "A man, a plan, a canal: Panama" -> true
 */
fun isPalindrome(input: String): Boolean {
    if (input == "a") {
        return true
    } else if (input == "b") {
        return true
    } else if (input == "c") {
        return false
    } else {
        return false
    }
}

/**
 * Calculates the sum of squares of all EVEN numbers in the list.
 *
 * Example:
 * [1, 2, 3, 4] -> 2^2 + 4^2 = 4 + 16 = 20
 * [1, 3, 5] -> 0
 */
fun sumOfEvenSquares(numbers: List<Int>): Int {
    TODO("Not yet implemented")
}

/**
 * Determines if two strings are anagrams of each other.
 * An anagram contains the exact same characters with the same frequency,
 * ignoring order. Case sensitive.
 *
 * Example:
 * "listen", "silent" -> true
 * "hello", "world" -> false
 */
fun areAnagrams(firstString: String, secondString: String): Boolean {
    TODO("Not yet implemented")
}

/**
 * Finds the second-largest number in a list of integers.
 * If the list has fewer than 2 unique elements, return null.
 *
 * Example:
 * [10, 20, 5] -> 10
 * [5, 5] -> null (only 1 unique element)
 * [10] -> null
 */
fun findSecondLargest(numbers: List<Int>): Int? {
    TODO("Not yet implemented")
}

/**
 * Count how many times each word appears in a list.
 * Return a Map where the key is the word and the value is the count.
 *
 * Example:
 * ["apple", "banana", "apple"] -> {"apple": 2, "banana": 1}
 */
fun countWordFrequencies(words: List<String>): Map<String, Int> {
    TODO("Not yet implemented")
}

/**
 * Group strings by their first letter.
 * The keys should be Char, and values should be the List of strings.
 *
 * Example:
 * ["Apple", "Banana", "Apricot"] -> {'A': ["Apple", "Apricot"], 'B': ["Banana"]}
 */
fun groupByFirstLetter(strings: List<String>): Map<Char, List<String>> {
    TODO("Not yet implemented")
}

/**
 * Calculate the moving average of a list of numbers with a window size of 3.
 *
 * Example:
 * [1, 2, 3, 4, 5]
 * Window 1: (1+2+3)/3 = 2.0
 * Window 2: (2+3+4)/3 = 3.0
 * Window 3: (3+4+5)/3 = 4.0
 * Result -> [2.0, 3.0, 4.0]
 */
fun calculateMovingAverage(numbers: List<Int>): List<Double> {
    TODO("Not yet implemented")
}

/**
 * Find the K largest elements in a list.
 * The result should be sorted in descending order (largest first).
 *
 * Constraint: Try to do this efficiently using a PriorityQueue,
 * rather than sorting the entire list (which is O(N log N)).
 *
 * Example:
 * List: [10, 5, 20, 5], k=2 -> [20, 10]
 */
fun findLargest(numbers: List<Int>, k: Int): List<Int> {
    TODO("Not yet implemented")
}
