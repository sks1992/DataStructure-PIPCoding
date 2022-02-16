package udemy_java;

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


import java.util.*;

//if No Repeated element present work fine
//Time Complexity = O(NLogN) + O(N)
public class UL_3_Triplets {

    public static void main(String[] args) {
        // int target = 18;
        int target = 0;
        //List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> listNumbers = List.of(-1, 0, 1, 2, -1, -4);
        Vector<Integer> v = new Vector<>(listNumbers);

        System.out.println(triplets(v, target));
    }

    public static Vector<Vector<Integer>> triplets(Vector<Integer> arr, int targetSum) {
        //Logic
        int n = arr.size();
        Collections.sort(arr);
        Vector<Vector<Integer>> result = new Vector<>();

        // Pick every a[i], pair sum for remaining part
        for (int i = 0; i <= n - 3; i++) {

            int j = i + 1;
            int k = n - 1;

            //two pointer approach
            while (j < k) {
                int current_sum = arr.get(i);
                current_sum += arr.get(j);
                current_sum += arr.get(k);

                if (current_sum == targetSum) {
                    Vector<Integer> vector = new Vector<>();
                    vector.add(arr.get(i));
                    vector.add(arr.get(j));
                    vector.add(arr.get(k));
                    result.add(vector);
                    j++;
                    k--;
                } else if (current_sum > targetSum) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;
    }
}

//LeetCode Solution here target sum =0
class Solution {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ReturnList = new ArrayList<>();
        Set<String> UniqueSet = new HashSet<>();
        Arrays.sort(nums);

        System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {
            //int CurrentNum = 0-nums[i];
            int CurrentNum = -nums[i];

            int left = (i == (nums.length - 1)) ? nums.length - 1 : i + 1;
            int right = nums.length - 1;

            //System.out.println("left:" + left + ", right :" +right );

            while (left < right) {
                int sumNum = nums[left] + nums[right];
                if (sumNum == CurrentNum) {
                    String KeyStr = String.valueOf(nums[i])
                            + nums[left]
                            + nums[right];
                    if (!UniqueSet.contains(KeyStr)) {
                        ReturnList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        UniqueSet.add(KeyStr);
                    }

                    left++;
                } else if (sumNum > CurrentNum) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return ReturnList;
    }

    public static void main(String[] args) {
        int[] InputArray = new int[]{-1, 0, 1, 2, -1, -4};
        //int[] InputArray = new int[]{-10, 5, -11, -15, 7, -7, -10, -8, -3, 13, 9, -14, 4, 3, 5, -7, 13, 1, -4};

        //
        System.out.println(threeSum(InputArray));

        System.out.println("****** end ******");
    }
}
