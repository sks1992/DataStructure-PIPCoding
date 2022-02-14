package interview_questions;

import java.util.Scanner;

// Java program to check whether a number
// is prime or not using recursion
class D1_PrimeNumber{

    static int i = 2;

    // Function check whether a number
// is prime or not
    public static boolean isPrime(int n)
    {

        // Corner cases
        if (n == 0 || n == 1)
        {
            return false;
        }

        // Checking Prime
        if (n == i)
            return true;

        // Base cases
        if (n % i == 0)
        {
            return false;
        }
        i++;
        return isPrime(n);
    }

    // Driver Code
    public static void main(String[] args)
    {
        if (isPrime(35))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}

/*

public class D1_PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scn.nextInt();

        if (primeNumber(n)) {
            System.out.println(n + " is  prime number");
        } else {
            System.out.println(n + " is not  prime number");
        }
    }

    private static boolean primeNumber(int n) {
        // Check if number is less than
        // equal to 1
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;

        } else if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
*/
