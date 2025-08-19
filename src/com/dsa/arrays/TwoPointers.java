package com.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoPointers {

    //Hashing (works for unsorted arrays, O(n))
    public static boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int check = target - arr[i];
            if(set.contains(check)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }


    //Two Pointers (only if array is sorted, O(n))
    public static boolean twoSumSorted(int arr[], int target) {
        int left =0; int right = arr.length-1;

        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                return true;
            }else if(sum < target){
                left ++;
            }else{
                right --;
            }
        }

        return false;
    }


    //Reverse String
    public static void reverseString(char[] s) {
        int left = 0; int right = s.length-1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;right--;
        }

    }

    //
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for(int right=0;right<nums.length;right++){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }

    }
}
