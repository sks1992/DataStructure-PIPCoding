package pipCoding.code_kotlin

import java.util.*
import kotlin.math.sqrt

fun main() {
    val scn = Scanner(System.`in`)
    val n = scn.nextDouble()
    isNumberIsPrime(n)
}

fun isNumberIsPrime(n: Double) {
    if (n == 0.0 || n == 1.0) {
        println("Number is not Prime")
    }

    if (n > 1) {
        for (i in 2 until sqrt(n).toInt()) {
            if (n % i == 0.0) {
                println("number is not Prime")
                return
            }
        }
        println("number is Prime")
    }
}
