package interview_questions

import java.util.*

/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such
that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same
element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
* */

fun main() {
    val scn = Scanner(System.`in`)
    println("Enter number of Element in nums array:")
    val n = scn.nextInt()
    val nums = IntArray(n)
    println("Enter Elements in array nums : ")
    for (i in 0 until n) {
        nums[i] = scn.nextInt()
    }
    println("Enter target value")
    val target = scn.nextInt()
    println(twoSum(nums, target).contentToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    //store result of index only on pair so length =2
    val result = IntArray(2)
    val hashmap = HashMap<Int, Int>()

    //searching hashMap
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (hashmap.containsKey(complement)) {
            result[0] = hashmap[complement]!!
            result[1] = i
        } else {

            //fill hashmap
            hashmap[nums[i]] = i
        }
    }
    return result
}
