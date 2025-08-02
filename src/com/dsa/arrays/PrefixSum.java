package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class PrefixSum {
    public static void subArrays(int[] arr) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int maxSubarraySum(int[] arr) {
        // Code here
        int maxEnd = arr[0], res = arr[0];
        for(int i=1; i<arr.length; i++){
            maxEnd = Math.max(maxEnd+arr[i], arr[i]);

            if(maxEnd>res){
                res = maxEnd;
            }
        }
        return res;
    }

    public static void prefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        System.out.println("\n");
        for (int j=0; j<prefixSum.length;j++){
            System.out.println(prefixSum[j]);
        }
    }
    public static int equi(int[] arr){
        int rightSum = arr[0];
        int leftSum = 0;
        for (int i = 1; i<arr.length;i++){
            rightSum += arr[i];
        }

        for(int j =0;j<arr.length;j++){
            rightSum = rightSum - arr[j];
            if(leftSum == rightSum)
                return j;
            leftSum += arr[j];
        }
        return -1;


    }

    public static List<Integer> querySum2(int n, int arr[], int q, int queries[]) {

        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        List<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<queries.length;i+=2){
            int l = queries[i];
            int r = queries[i+1];

            int sum = 0;
            if(l==1){
                sum = prefixSum[r-1];
            }else {
                sum = prefixSum[r-1]-prefixSum[l-2];
            }

            arrayList.add(sum);
        }

        return arrayList;
    }
}
