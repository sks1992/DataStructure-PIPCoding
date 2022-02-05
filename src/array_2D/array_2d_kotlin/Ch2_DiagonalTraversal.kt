package array_2D.array_2d_kotlin

import java.util.*

//Diagonal Traversal Problem
// [1 2]
// [3 4]
//ans  1 4 2
fun main() {
    diagonalTraversalProblem()
}

fun diagonalTraversalProblem() {
    val scn = Scanner(System.`in`)
    println("Enter no. of Element in array:")
    val n = scn.nextInt()
    //create new array
    val arr = Array(n) { IntArray(n) }
    println("Enter element in array")
    for (i in arr.indices) {
        for (j in 0 until arr[0].size) {
            arr[i][j] = scn.nextInt()
        }
    }
    //g =gap between j and i
    for (g in arr.indices) {
        var i = 0
        var j = g
        while (j < arr.size) {
            println(arr[i][j])
            i++
            j++
        }
    }
}
