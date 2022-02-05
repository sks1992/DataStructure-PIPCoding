package array.array_kotlin

import java.util.*


fun main() {
    spanOfAnArray()
}

fun spanOfAnArray() {
    val scn = Scanner(System.`in`)
    val n = scn.nextInt()
    val arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] = scn.nextInt()
    }
    var max = arr[0]
    var min = arr[0]
    for (i in 1 until arr.size) {
        if (arr[i] > max) {
            max = arr[i]
        }
    }
    for (i in 1 until arr.size) {
        if (arr[i] < min) {
            min = arr[i]
        }
    }
    val span = max - min
    println(span)
}

/*
    val n =  readLine()!!.toInt()
    val arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] =  readLine()!!.toInt()
    }
* */