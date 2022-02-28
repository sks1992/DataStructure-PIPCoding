package pipCoding.code_kotlin

import java.util.*


fun main() {
    val scn = Scanner(System.`in`)
    val n = scn.nextInt()
    var a = 0
    var b = 1
    var c: Int
    for (i in 0 until n) {
        println(a)
        c = a + b
        a = b
        b = c
    }
}