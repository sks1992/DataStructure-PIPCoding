package pipCoding.code_kotlin

import java.util.*


fun main() {
    val scn = Scanner(System.`in`)
    val low = scn.nextInt()
    val high = scn.nextInt()
    primeNumberBetweenN(low, high)
}

fun primeNumberBetweenN(low: Int, high: Int) {
    for (n in low..high) {
        var count = 0
        var div = 2
        while (div * div <= n) {
            if (n % div == 0) {
                count++
                break
            }
            div++
        }
        if (count == 0) {
            println(n)
        }
    }
}