package pipCoding.code_kotlin

import java.util.*
import kotlin.math.pow

fun main() {
    val scn = Scanner(System.`in`)
    var n = scn.nextInt()
    var nod = 0
    var temp = n
    while (temp != 0) {
        temp /= 10
        nod++
    }
    var div = 10.0.pow((nod - 1).toDouble()).toInt()
    while (div != 0) {
        val q = n / div
        println(q)
        n %= div
        div /= 10
    }
}

