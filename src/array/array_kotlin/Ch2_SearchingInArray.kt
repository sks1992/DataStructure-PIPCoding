package array.array_kotlin

import java.util.*

fun main() {
    searchingInArray()
}

fun searchingInArray() {
    val scn = Scanner(System.`in`)
    val n = scn.nextInt()

    val arr = IntArray(n)

    for (i in arr.indices) {
        arr[i] = scn.nextInt()
    }

    val data = scn.nextInt()

    var index = -1
    for (i in arr.indices) {
        if (arr[i] == data) {
            index = i
            break
        }
    }

    println(index)
}
