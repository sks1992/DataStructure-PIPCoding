package udemy_java;

import java.util.Scanner;
import java.util.Vector;

/*
1.FizzBuzz Text
Write a fizzBizzTest function that returns a vector<string>
with the numbers from 1 to n with following restriction
1.for multiples of 3 store "Fizz" instead of the number
2.for multiples of 5 store "Buzz" instead of the number
3.for numbers which are multiples of both 3 and 5 store "FizzBuzz"

you may use the std::to_string(number) method to convert a number into a string
Example::
fizzbuzz(15) == {
"1","2","Fizz","4","Buzz",
"Fizz","7","8","Fizz","Buzz",
"11","Fizz","13","14","FizzBuzz"
}

hint :
Expected Time Complexity O(N)
Expected Space Complexity O(N)
* */
public class UL_1_FizzBuzzText {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println( FizzBuzz(n));
    }


    public static Vector<String> FizzBuzz(int n) {

        //create  a vector
        Vector<String> result = new Vector<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(i + "");
            }
        }
        return result;
    }
}
