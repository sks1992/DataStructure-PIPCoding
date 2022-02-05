package array.array_kotlin

import java.util.*

fun main() {
    sumOfTwoArray()
}

fun sumOfTwoArray() {
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

    // val sum = IntArray(Math.max(n1, n2))
    val sum = IntArray(n1.coerceAtLeast(n2))

    var c = 0
    var i = arr1.size - 1
    var j = arr2.size - 1
    var k = sum.size - 1


    while (k >= 0) {
        var d = c
        if (i >= 0) {
            d += arr1[i]
        }
        if (j >= 0) {
            d += arr2[j]
        }
        c = d / 10
        d %= 10
        sum[k] = d
        i--
        j--
        k--
    }
    if (c != 0) {
        print(c)
    }
    for (`val` in sum) {
        print(`val`)
    }

}
