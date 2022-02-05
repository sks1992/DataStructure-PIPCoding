package array.array_kotlin

import java.util.*


fun main() {
    barChart()
}

fun barChart() {
    val scn = Scanner(System.`in`)

    val n = scn.nextInt()
    val arr = IntArray(n)

    for (i in arr.indices) {
        arr[i] = scn.nextInt()
    }

    var max = arr[0]
    for (i in 1 until arr.size) {
        if (arr[i] > max) {
            max = arr[i]
        }
    }

    for (floor in max downTo 1) {
        for (i in arr.indices) {
            if (arr[i] >= floor) {
                print("*\t")
            } else {
                print("\t")
            }
        }
        println()
    }
}
