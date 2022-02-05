package array_2D.array_2d_kotlin

import java.util.*

fun main() {
    saddlePoint()
}

fun saddlePoint() {
    val scn = Scanner(System.`in`)
    println("Enter no. of Element in array:")
    val n = scn.nextInt()
    //create new array
    //create new array
    val arr = Array(n) { IntArray(n) }
    println("Enter element in array")
    for (i in arr.indices) {
        for (j in 0 until arr[0].size) {
            arr[i][j] = scn.nextInt()
        }
    }


    for (ints in arr) {
        var svj = 0
        for (j in 1 until arr[0].size) {
            if (ints[j] < ints[svj]) {
                svj = j
            }
        }
        var flag = true
        for (value in arr) {
            if (value[svj] > ints[svj]) {
                flag = false
                break
            }
        }
        if (flag) {
            println("Saddle point is" + ints[svj])
            return
        }
    }
    println("Invalid input")
}
