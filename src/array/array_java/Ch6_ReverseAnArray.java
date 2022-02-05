package array.array_java;

import java.util.Scanner;

public class Ch6_ReverseAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Print Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reverse Array");

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
