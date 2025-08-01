package com.dsa.foundation;

public class MathUtilities {

    public static int gcdIterative(int a, int b){
        while(b!=0){
            int temp =  b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void reverseArray(int[] arr){
        int i = 0;
        int j= arr.length-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public static int secondMax(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            throw new RuntimeException("No distinct second maximum found.");
        }

        return secondMax;
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length + 1; // Since one number is missing
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min = prices[i];
            }

            profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }

    public static int maxProfitTwo(int[] prices) {
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] >  prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
