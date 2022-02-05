package array_2D.array_2d_java;

import java.util.Scanner;

public class Ch3_SaddlePoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of Element in array:");
        int n = scn.nextInt();
        //create new array
        int[][] arr = new int[n][n];
        System.out.println("Enter element in array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }


        for (int[] ints : arr) {
            int svj = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (ints[j] < ints[svj]) {
                    svj = j;
                }
            }
            boolean flag = true;
            for (int[] value : arr) {
                if (value[svj] > ints[svj]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Saddle point is"+ints[svj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}
