package array.array_java;

import java.util.Scanner;

public class Ch9_CeilAndFloor {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        int lo = 0;
        int hi = arr.length - 1;
        int ceil = 0;
        int floor = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > arr[mid]) {
                lo = mid + 1;
                floor = arr[mid];
            } else if (data < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
            }
        }

        System.out.println("Ceil is " + ceil + " Floor is " + floor);
    }
}
