package udemy_kotlin

import java.util.*

fun main() {
    val scn = Scanner(System.`in`)
    val n = scn.nextInt()
    println(fizzBuzz(n))
}

fun fizzBuzz(n: Int): Vector<String> {

    //create  a vector
    val result = Vector<String>()

    for (i in 1..n) {
        when {
            i % 15 == 0 -> result.add("FizzBuzz")

            i % 5 == 0 -> result.add("Buzz")

            i % 3 == 0 -> result.add("Fizz")

            else -> result.add(i.toString() + "")

        }
    }
    return result
}

