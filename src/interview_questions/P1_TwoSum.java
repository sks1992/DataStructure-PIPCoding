package interview_questions;

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


    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map  =new HashMap<>();

        //fill hashmap
        for(int i =0;i<nums.length ;i++){
            map.put(nums[i],i );
        }
        //searching hashMap
        for (int  i=0;i< nums.length;i++){
            int  num =nums[i];
            int rem =target-num;
            if (map.containsKey(rem)){
                int index =map.get(rem);
                if (index ==i){
                    return new int[]{i ,index};
                }
            }
        }
        return new int[]{};
    }
}



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