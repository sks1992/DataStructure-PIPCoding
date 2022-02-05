package array.array_kotlin

import java.util.*

fun main() {
    reverseAnArray()
}

fun reverseAnArray() {
    val scn = Scanner(System.`in`)
    val n = scn.nextInt()
    val arr = IntArray(n)
    println("Print Array")
    for (i in arr.indices) {
        arr[i] = scn.nextInt()
    }

    var i = 0
    var j = arr.size - 1
    while (i <= j) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        i++
        j--
    }
    println("Reverse Array")

    for (k in arr.indices) {
        print(arr[k].toString() + " ")
    }
}
