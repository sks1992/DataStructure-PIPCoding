package array_2D.array_2d_kotlin

import java.util.*

fun main() {
    matrixMultiplication()
}

fun matrixMultiplication() {


    val scn = Scanner(System.`in`)

    println("Enter value of row r1")
    val r1 = scn.nextInt()

    println("Enter value of column c1")
    val c1 = scn.nextInt()

    val arr1 = Array(r1) { IntArray(c1) }

    println("Enter value of array")
    for (i in arr1.indices) {
        for (j in 0 until c1) {
            arr1[i][j] = scn.nextInt()
        }
    }

    println("Enter value of row r2")
    val r2 = scn.nextInt()

    println("Enter value of column c2")
    val c2 = scn.nextInt()

    val arr2 = Array(r2) { IntArray(c2) }

    println("Enter value of array")
    for (i in arr2.indices) {
        for (j in 0 until c2) {
            arr2[i][j] = scn.nextInt()
        }
    }

    if (c1 != r2) {
        println("Invalid input")
        return
    }

    val prod = Array(r1) { IntArray(c2) }
    for (i in prod.indices) {
        for (j in 0 until prod[0].size) {
            for (k in 0 until c1) {
                prod[i][j] = prod[i][j] + arr1[i][k] + arr2[k][j]
            }
        }
    }

    for (i in prod.indices) {
        for (j in 0 until prod[0].size) {
            println(prod[i][j].toString() + " ")
        }
        println()
    }

}

/*
val scn = Scanner(System.`in`)

    println("Enter value of n")
    val n = scn.nextInt()

    println("Enter value of m")
    val m = scn.nextInt()

    val arr = Array(n) { IntArray(m) }

    println("Enter value of array")
    for (i in 0 until n) {
        for (j in 0 until m) {
            arr[i][j] = scn.nextInt()
        }
    }

    println("Print 2D Array")
    for (i in arr.indices) {
        for (j in 0 until arr[i].size) {
            print(arr[i][j].toString() + " ")
        }
        println()
    }
* */