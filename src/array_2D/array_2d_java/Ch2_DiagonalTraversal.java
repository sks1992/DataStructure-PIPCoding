package array_2D.array_2d_java;

import java.util.Scanner;
//Diagonal Traversal Problem
public class Ch2_DiagonalTraversal {
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
        //g =gap between j and i
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0, j = g; j< arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
