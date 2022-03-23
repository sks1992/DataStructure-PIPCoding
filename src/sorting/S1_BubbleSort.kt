package sorting

/**
 * Bubble Sort
 * In-place Algorithm
 * O(n^2) time complexity - quadratic
 * Algorithm degrades quickly
 */

fun main() {
    val intArray = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    for (lastUnSortedIndex in intArray.size - 1 downTo 1) {
        for (i in 0 until lastUnSortedIndex) {
            if (intArray[i] > intArray[i + 1]) {
                swap(intArray, i, i + 1)
            }
        }
    }
    println("Sorted Array")
    for (i in intArray.indices) {
        print(intArray[i].toString() + "\t\t")
    }
}

fun swap(array: IntArray, i: Int, j: Int) {
    if (i == j) return
    val temp = array[i]
    array[i] = array[j]
    array[j] = temp
}
//time complexity =O(n^2)