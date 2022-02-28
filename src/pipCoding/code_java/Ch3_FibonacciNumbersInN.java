package pipCoding.code_java;

import java.util.Scanner;

public class Ch3_FibonacciNumbersInN {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
