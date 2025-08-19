package com.dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SlidingWindow {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int avgSum = 0;
        for (int i = 0; i < k; i++) {
            avgSum += arr[i];
        }
        int res = 0;
        if ((avgSum / k) >= threshold) {
            res++;
        }
        for (int j = k; j < arr.length; j++) {
            avgSum += arr[j] - arr[j - k];
            if ((avgSum / k) >= threshold) {
                res++;
            }

        }
        return res;
    }

    /*  Input: arr[] = [100, 200, 300, 400] , k = 2
        Output: 700
        Explanation: arr3  + arr4 = 700, which is maximum. */
    public static void maximumSumSubarray(int[] arr, int k){
        int sum = 0;
        for (int j=0;j<k;j++){
            sum += arr[j];
        }
        int maxSum = sum;
        for(int i=k;i<arr.length;i++){
            sum += arr[i]-arr[i-k];
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println("***** MaxSumSubArray : "+ maxSum +" ******");
    }



    /*
        Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
        Output: [-8, 0, -6, -6]
        Explanation:
        Window [-8, 2] First negative integer is -8.
        Window [2, 3] No negative integers, output is 0.
        Window [3, -6] First negative integer is -6.
        Window [-6, 10] First negative integer is -6.
    */
    public static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<=arr.length-k;i++){
            boolean check = false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    list.add(arr[j]);
                    check = true;
                    break;
                }
            }
            if(!check){
                list.add(0);
            }
        }
        return list;
    }


    //Longest Substring Without Repeating Characters
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            if(charCount.containsKey(c)){
                left = Math.max(left, charCount.get(c)+1);
            }
            charCount.put(c,right);
            maxLen = Math.max(right-left+1, maxLen);
        }
        return maxLen;
    }
}