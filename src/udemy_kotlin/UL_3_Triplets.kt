package udemy_kotlin

import java.util.*

/*
Problem :: 3Sum
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such
that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:

Input: nums = []
Output: []

Example 3:

Input: nums = [0]
Output: []


Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
* */


fun main() {
    val target = 18
    val v = Vector<Int>()
    v.addAll(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))

    println(triplets(v, target))

    //leet code solution
    val inputArray = intArrayOf(-1, 0, 1, 2, -1, -4)
    //int[] InputArray = new int[]{-10, 5, -11, -15, 7, -7, -10, -8, -3, 13, 9, -14, 4, 3, 5, -7, 13, 1, -4};

    //
    println(threeSum(inputArray))
    println("****** end ******")
}

//if No Repeated element present work fine
//Time Complexity = O(NLogN) + O(N)
fun triplets(arr: Vector<Int>, targetSum: Int): Vector<Vector<Int>> {
    //Logic
    val n = arr.size
    arr.sort()
    val result = Vector<Vector<Int>>()

    // Pick every a[i], pair sum for remaining part
    for (i in 0..n - 3) {
        var j = i + 1
        var k = n - 1

        //two pointer approach
        while (j < k) {
            var currentSum = arr[i]
            currentSum += arr[j]
            currentSum += arr[k]
            if (currentSum == targetSum) {
                val vector = Vector<Int>()
                vector.add(arr[i])
                vector.add(arr[j])
                vector.add(arr[k])
                result.add(vector)
                j++
                k--
            } else if (currentSum > targetSum) {
                k--
            } else {
                j++
            }
        }
    }
    return result
}


private fun threeSum(nums: IntArray): List<List<Int>> {
    val returnList: MutableList<List<Int>> = ArrayList()
    val uniqueSet: MutableSet<String> = HashSet()
    Arrays.sort(nums)
    println(nums.size)
    for (i in nums.indices) {
        //int CurrentNum = 0-nums[i];
        val currentNum = -nums[i]
        var left = if (i == nums.size - 1) nums.size - 1 else i + 1
        var right = nums.size - 1

        //System.out.println("left:" + left + ", right :" +right );
        while (left < right) {
            val sumNum = nums[left] + nums[right]
            if (sumNum == currentNum) {
                val keyStr = (nums[i].toString() + nums[left]
                        + nums[right])
                if (!uniqueSet.contains(keyStr)) {
                    returnList.add(listOf(nums[i], nums[left], nums[right]))
                    uniqueSet.add(keyStr)
                }
                left++
            } else if (sumNum > currentNum) {
                right--
            } else {
                left++
            }
        }
    }
    return returnList
}

