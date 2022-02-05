package array.array_java;

import java.util.Scanner;

//wrong code check again
public class Ch7_RotateAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter No. n:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter No. K:");
        int k = scn.nextInt();

        reverse(arr, 0, k - 1);
        rotate(arr, k);
        display(arr);


    }

    public static void reverse(int[] arr, int i, int j) {
        int li = i;
        int ri = j;

        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void rotate(int[] arr, int k) {

        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
