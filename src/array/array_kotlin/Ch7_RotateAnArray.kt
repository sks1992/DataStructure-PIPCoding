package array.array_kotlin

import java.util.*

//wrong code check again
fun main() {
    rotateAnArray()
}

fun rotateAnArray() {
    val scn = Scanner(System.`in`)
    println("Enter No. n:")
    val n = scn.nextInt()
    val arr = IntArray(n)
    println("Enter array")
    for (i in arr.indices) {
        arr[i] = scn.nextInt()
    }
    println("Enter No. K:")
    val k = scn.nextInt()
    reverse(arr, 0, k)
    rotate(arr, k)
    display(arr)
}

fun reverse(arr: IntArray, i: Int, j: Int) {
    var li = i
    var ri = j
    while (li < ri) {
        val temp = arr[li]
        arr[li] = arr[ri]
        arr[ri] = temp
        li++
        ri--
    }
}

fun rotate(arr: IntArray, k: Int) {
    var k = k
    k %= arr.size
    if (k < 0) {
        k += arr.size
    }
    reverse(arr, 0, arr.size - k - 1)
    reverse(arr, arr.size - k, arr.size - 1)
    reverse(arr, 0, arr.size - 1)
}

fun display(arr: IntArray) {
    for (i in arr.indices) {
        print(arr[i].toString() + " ")
    }
}