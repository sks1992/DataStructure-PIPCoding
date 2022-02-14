package test

import java.util.regex.Pattern

/*
* A-2: Write a function that takes an input parameter as a String. The function should reverse the statement but
*  keep the words intact and print it. Words are separated by dots. (Avoid using inbuilt functions)

If input is “i.like.this.program.very.much”
Output will be “much.very.program.this.like.i”

*/
fun main() {
    val text = "i.like.this.program.very.much"

    println(reverseWords(text))

//    var test = Test()
//    val phrase = "i.like.this.program.very.much"
//    val output = test.reverseWords(phrase.toCharArray())
//    print(output)
}

// Method to reverse words of a String
fun reverseWords(str: String?): String {

    // Specifying the pattern to be searched
    val pattern = Pattern.compile("\\.") //for space use "\\s"

    // splitting String str with a pattern
    // (i.e )splitting the string whenever their
    //  is whitespace and store in temp array.
    val temp = pattern.split(str)
    var result = ""

    // Iterate over the temp array and store
    // the string in reverse order.
    for (i in temp.indices) {
        result = if (i == temp.size - 1) temp[i].toString() + result else "." + temp[i] + result
    }
    return result
}


//class Test {
//    fun reverse(str: CharArray, start: Int, end: Int) {
//        var start = start
//        var end = end
//        var temp: Char
//        while (start <= end) {
//            temp = str[start]
//            str[start] = str[end]
//            str[end] = temp
//            start++
//            end--
//        }
//    }
//
//    fun reverseWords(pharase: CharArray): CharArray {
//        var start = 0
//        for (end in pharase.indices) {
//            if (pharase[end] == '.') {
//                reverse(pharase, start, end)
//                start = end + 1
//            }
//        }
//        reverse(pharase, start, pharase.size - 1)
//        reverse(pharase, 0, pharase.size - 1)
//        return pharase
//    }
//}

