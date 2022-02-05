package array.array_java;
/*
1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
* */

import java.util.Scanner;

public class Ch13_RunningSumOf1dArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of Element in Array n:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element in array :");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] runningSum = new int[n];
         runningSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            runningSum[i] = runningSum[i-1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(runningSum[i] + " ");
        }
    }
}
