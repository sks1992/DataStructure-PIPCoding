package sorting

/**
 * Selection Sort
 * In-place Algorithm
 * O(n^2) time complexity - quadratic
 * Algorithm degrades quickly
 */

    fun main() {
        val intArray = intArrayOf(20, 35, -15, 7, 55, 1, -22)
        for (lastUnsortedIndex in intArray.size - 1 downTo 1) {
            var largest = 0
            for (i in 1..lastUnsortedIndex) {
                if (intArray[i] > intArray[largest]) {
                    largest = i
                }
            }
            swap(intArray, largest, lastUnsortedIndex)
        }
        println("Sorted Array")
        for (i in intArray.indices) {
            print(intArray[i].toString() + "\t\t")
        }
    }
//time complexity =O(n^2)