package array.array_kotlin

import java.util.*

fun main() {
    firstAndLastIndex()
}

fun firstAndLastIndex() {
    val scn = Scanner(System.`in`)

    val n = scn.nextInt()
    val arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] = scn.nextInt()
    }
    val data = scn.nextInt()

    var lo = 0
    var hi = arr.size - 1
    var fi = -1

    while (lo <= hi) {
        val mid = (lo + hi) / 2
        if (data > arr[mid]) {
            lo = mid + 1
        } else if (data < arr[mid]) {
            hi = mid - 1
        } else {
            fi = mid
            hi = mid - 1
        }
    }

    println("First index $fi")

    lo = 0
    hi = arr.size - 1
    var li = -1

    while (lo <= hi) {
        val mid = (lo + hi) / 2
        if (data > arr[mid]) {
            lo = mid + 1
        } else if (data < arr[mid]) {
            hi = mid - 1
        } else {
            li = mid
            lo = mid + 1
        }
    }
    println("Last index $li")
}
