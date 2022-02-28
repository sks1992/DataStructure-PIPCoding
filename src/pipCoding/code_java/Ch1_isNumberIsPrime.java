package pipCoding.code_java;

import java.util.Scanner;

public class Ch1_isNumberIsPrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        for (int i = 0; i < n1; i++) {
            int n = scn.nextInt();

            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("No is Prime");
            } else {
                System.out.println("No is Not Prime");
            }
        }
    }
}
