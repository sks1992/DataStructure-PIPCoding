package array.array_kotlin

import java.util.*

fun main() {
    ceilAndFloor()
}

fun ceilAndFloor() {
    val scn = Scanner(System.`in`)

    val n = scn.nextInt()
    val arr = IntArray(n)

    for (i in arr.indices) {
        arr[i] = scn.nextInt()
    }

    val data = scn.nextInt()
    var lo = 0
    var hi = arr.size - 1
    var ceil = 0
    var floor = 0
    while (lo <= hi) {
        val mid = (lo + hi) / 2
        if (data > arr[mid]) {
            lo = mid + 1
            floor = arr[mid]
        } else if (data < arr[mid]) {
            hi = mid - 1
            ceil = arr[mid]
        } else {
            ceil = arr[mid]
            floor = arr[mid]
        }
    }
    println("Ceil is $ceil Floor is $floor")
}
