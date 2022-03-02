package pipCoding.code_kotlin

import java.util.*

fun main() {
    val scn = Scanner(System.`in`)
    var n = scn.nextInt()
    var digits = 0
    while (n != 0) {
        n /= 10
        digits++
    }
    println(digits)
}


