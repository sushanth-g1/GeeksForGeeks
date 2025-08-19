package com.dsa.arrays;

import java.util.ArrayList;

public class Recursion {

    //calculate the sum of first N natural numbers
    public static int sum(int n){
        if(n==0 || n== 1){
            return n;
        }
        return sum(n-1)+n;
    }

    //calculate factorial
    public static int fact(int n){
        if(n==0)
            return 1;
        return fact(n-1)*n;
    }

    /*fibonacci series
    *   0   1   2   3   4   5   6   7   : Index
    *   0   1   1   2   3   5   8   13  : fibo
    */
    public static int fibo(int n){
        if(n==0 || n==1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }

    //Print all numbers from 1-10 in increasing order
    public static void printNumbers(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }

    //Given a string check if it is a palindrome between the given index
    public static boolean checkPalindrome(String s, int i, int j){
        boolean check = false;
        if(i>j)
            return true;
        if(s.charAt(i) == s.charAt(j))
            return checkPalindrome(s,i+1,j-1);
        return check;
    }

    //Implement the power function
    public static int power(int a, int n){
        if(n==0 || a==0)
            return 1;

        int calculateHalf = power(a,n/2);
        int ans = calculateHalf * calculateHalf;

        if(n%2 !=0){
            return ans * a;
        }else{
            return ans;
        }


    }


    //Subset Sums
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here

        ArrayList<Integer> result = new ArrayList<Integer>();
        helper(result,arr,0,arr.length,0);
        return result;
    }
    public static void helper(ArrayList<Integer> result, int[] arr,
                              int i, int n, int sum){

        if(i==n){
            result.add(sum);
            return;
        }

        helper(result,arr,i+1,n,sum);
        helper(result,arr,i+1,n,sum+arr[i]);
    }


    //Subset Sum Problem 

}
