package array.array_kotlin

import java.util.*

fun main() {
    differenceOfTwoArray()
}

fun differenceOfTwoArray() {
    val scn = Scanner(System.`in`)

    val n1 = scn.nextInt()
    val arr1 = IntArray(n1)
    for (i in arr1.indices) {
        arr1[i] = scn.nextInt()
    }

    val n2 = scn.nextInt()
    val arr2 = IntArray(n2)
    for (i in arr2.indices) {
        arr2[i] = scn.nextInt()
    }

    val diff = IntArray(n2)

    var c = 0
    var d: Int
    var i = arr1.size - 1
    var j = arr2.size - 1
    var k = diff.size - 1

    while (k >= 0) {
        val a1v = if (i >= 0) arr1[i] else 0
        if (arr2[j] + c >= a1v) {
            d = arr2[j] + c - a1v
            c = 0
        } else {
            d = arr2[j] + c + 10 - a1v
            c = -1
        }
        diff[k] = d
        i--
        j--
        k--
    }

    var index = 0
    while (index < diff.size) {
        if (diff[index] == 0) {
            index++
        } else {
            break
        }
    }
    while (index < diff.size) {
        println(diff[index])
        index++
    }
}
