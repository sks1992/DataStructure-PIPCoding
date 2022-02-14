package interview_questions

import java.util.*
import kotlin.math.sqrt


fun main() {
    val scn = Scanner(System.`in`)
    println("Enter Number")
    val n = scn.nextInt()
    if (primeNumber(n)) {
        println("$n is  prime number")
    } else {
        println("$n is not  prime number")
    }

    if (isPrime(n)) {
        println("$n is  prime number")
    } else {
        println("$n is not  prime number")
    }
}

private fun primeNumber(n: Int): Boolean {
    // Check if number is less than
    // equal to 1
    if (n <= 1) {
        return false
    } else if (n == 2) {
        return true
    } else if (n % 2 == 0) {
        return false
    }

    var i = 3

    while (i <= sqrt(n.toDouble())) {
        if (n % i == 0) {
            return false
        }
        i += 2
    }
    return true
}
//time complexity =O(sqrt{n})  space complexity =1

fun isPrime(n: Int): Boolean {
    var i = 2

    // Corner cases
    if (n == 0 || n == 1) {
        return false
    }

    // Checking Prime
    if (n == i) return true

    // Base cases
    if (n % i == 0) {
        return false
    }
    i++
    return isPrime(n)
}
//time complexity =O(n) space complexity =O(n)