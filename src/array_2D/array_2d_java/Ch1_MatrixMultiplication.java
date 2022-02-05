package array_2D.array_2d_java;

import java.util.Scanner;

public class Ch1_MatrixMultiplication {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter value of row r1");
        int r1 = scn.nextInt();

        System.out.println("Enter value of column c1");
        int c1 = scn.nextInt();

        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter value of array");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }

        System.out.println("Enter value of row r2");
        int r2 = scn.nextInt();

        System.out.println("Enter value of column c2");
        int c2 = scn.nextInt();

        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter value of array");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        if (c1 != r2) {
            System.out.println("Invalid input");
            return;
        }

        int[][] prod = new int[r1][c2];
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] = prod[i][j] + arr1[i][k] + arr2[k][j];
                }
            }
        }

        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                System.out.println(prod[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class Array_2D_Declaration {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter value of row r1");
        int r1 = scn.nextInt();

        System.out.println("Enter value of column c1");
        int c1 = scn.nextInt();

        int[][] arr = new int[r1][c1];

        System.out.println("Enter value of array");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Print 2D Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

