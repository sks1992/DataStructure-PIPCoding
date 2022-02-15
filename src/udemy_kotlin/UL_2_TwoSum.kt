package udemy_kotlin

/*
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that
 they add up to target.

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

 1.  2 <= nums.length <= 104
 2.  -109 <= nums[i] <= 109
 3.  -109 <= target <= 109
 4.  Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
* */

/*
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that
 they add up to target.

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

 1.  2 <= nums.length <= 104
 2.  -109 <= nums[i] <= 109
 3.  -109 <= target <= 109
 4.  Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
* */

fun main() {
    val target = 6
    val arr = intArrayOf(3, 2, 4)
    println(twoSum(arr, target).contentToString())
    println(twoSumBrutForce(arr, target).contentToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    //to store pain of result indices
    val result = IntArray(2)
    val map = HashMap<Int, Int>()

    //search for complement
    for (i in nums.indices) {
        if (map.containsKey(target - nums[i])) {
            result[0] = map[target - nums[i]]!!
            result[1] = i
        } else {
            map[nums[i]] = i
        }
    }
    return result
}


//time complexity O(N2)
fun twoSumBrutForce(nums: IntArray, target: Int): IntArray {
    //to store pairs of indices
    val result = IntArray(2)
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            val comp = target - nums[i]
            if (nums[j] == comp) {
                //return  value not indices
                result[0] = nums[i]
                result[1] = nums[j]
                break
            }
        }
    }
    return result
}