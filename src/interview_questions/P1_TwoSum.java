package interview_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P1_TwoSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of Element in nums array:");
        int n = scn.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter Elements in array nums :");
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        System.out.println("Enter target value");
        int target = scn.nextInt();


        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        //store result of index only on pair so length =2
        int[] result = new int[2];

        HashMap<Integer, Integer> hashmap = new HashMap<>();

        //searching hashMap
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashmap.containsKey(complement)) {
                result[0] = hashmap.get(complement);
                result[1] = i;
            } else {
                hashmap.put(nums[i], i);
            }
        }
        return result;
    }
}

//Time Complexity =O(n)
//Space Complexity =O(n)

/*
 public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of Element in nums array:");
        int n = scn.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter Elements in array nums :");
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        System.out.println("Enter target value");
        int target = scn.nextInt();

        twoSum(nums, target);
        for (int i=0;i<twoSum(nums,target).length ;i++){
            System.out.print(twoSum(nums,target)[i] +"" );
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        //brute force
        for (int i=0;i< nums.length;i++){
            for (int j =i+1;j< nums.length;j++){
                int complement =target -nums[i];
                if (nums[j] ==complement){
                    return new int [] {i,j};
                }
            }
        }

        throw  new IllegalArgumentException("");
    }
* */