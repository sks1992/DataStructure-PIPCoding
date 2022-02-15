package udemy_java;

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

import java.util.Arrays;
import java.util.HashMap;

public class UL_2_TwoSum {

    public static void main(String[] args) {
        int target = 4;
        int[] arr = new int[]{10,5,2,3,-6,9,11};
        System.out.println(Arrays.toString(twoSum(arr, target)));
      //  System.out.println(Arrays.toString(twoSumBrutForce(arr, target)));
    }

    //time complexity O(N)
    static int[] twoSum(int[] nums, int target) {
        //to store pair of result indices
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        //search for complement
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    //time complexity O(N2)
    static int[] twoSumBrutForce(int[] nums, int target) {
        //to store pairs of indices
        int[] result =new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int comp =target-nums[i];
                if (nums[j] == comp){
                    //return  value not indices
                    result[0] =nums[i];
                    result[1] =nums[j];
                    break;
                }
            }
        }
        return result;
    }
}
