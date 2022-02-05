package array.array_kotlin

import java.util.*

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

fun main() {
    runningSumOf1dArray()
}

fun runningSumOf1dArray() {
    val scn = Scanner(System.`in`)
    println("Enter no. of Element in Array n:")
    val n = scn.nextInt()
    val arr = IntArray(n)
    println("Enter Element in array :")
    for (i in 0 until n) {
        arr[i] = scn.nextInt()
    }
    val runningSum = IntArray(n)
    runningSum[0] = arr[0]
    for (i in 1 until n) {
        runningSum[i] = runningSum[i - 1] + arr[i]
    }

    for (i in 0 until n) {
        print(runningSum[i].toString() + " ")
    }
}
