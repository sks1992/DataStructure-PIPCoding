package test
/*
A-4: Write a program to merge two lists by alternatively taking elements from each list. The method will take 2 arrays as input and return the merged array as output.
Input: [1,2,3] and [a,b,c] Output: [1,a,2,b,3,c]
Input: [1,2,3,4,5] and [a,b,c] Output: [1,a,2,b,3,c,4,5]
Input: [1,2,3] and [a,b,c,d,e] Output: [1,a,2,b,3,c,d,e]
*/


fun testArray() {

    val array1: Array<Any> = arrayOf(1, 2, 3)
    val array2: Array<Any> = arrayOf('a', 'b', 'c', 'd', 'e')

    val length1 = array1.size
    println(length1)
    val length2 = array2.size
    println(length2)
    val length3 = length1 + length2
    println(length3)

    val array3: Array<Any> = Array(length3){}

    var i = 0
    var j = 0
    var k = 0
    var m = 0

    val r = if (length1 < length2) length1 else length2

    while (m < r) {

        array3[k++] = array1[i++]
        array3[k++] = array2[j++]
        m++

    }
    while (k < length3) {
        if (length1 < length2) array3[k++] = array2[j++] else array3[k++] = array1[i++]
    }
    for (n in 0 until length3) {
        print(array3[n].toString() + " ")
    }
}

fun main() {
    testArray()
}


