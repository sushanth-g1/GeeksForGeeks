package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BackTracking {

    //Print all subsequences of a string
    //https://youtu.be/LqKaUv1G3_I?si=ivIm46XdCH92nki1
    //Power Set
    public static List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        helper(0,s,"",ans,s.length());

        Collections.sort(ans);
        return ans;

    }

    public static void helper(int i, String s, String path, List<String> ans, int n) {

        if (i == n) {
            ans.add(path);
            return;
        }

        helper(i + 1, s, path, ans, n);
        helper(i + 1, s, path + s.charAt(i), ans, n);

    }


    // RAT IN A MAZE
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here

        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        solve(ans,"",0,0,maze,visited,n);
        return ans;

    }
    public static void solve(ArrayList<String> ans,String path,int i, int j,int[][] m, boolean[][] visited,int n){

        if(i== n-1 && j==n-1){
            ans.add(path);
            return;
        }

        visited[i][j] = true;

        if(isSafe(i+1,j,m,n,visited)){
            solve(ans,path+"D",i+1,j,m,visited,n);
        }
        if(isSafe(i,j-1,m,n,visited)){
            solve(ans,path+"L",i,j-1,m,visited,n);
        }
        if(isSafe(i,j+1,m,n,visited)){
            solve(ans,path+"R",i,j+1,m,visited,n);
        }
        if(isSafe(i-1,j,m,n,visited)){
            solve(ans,path+"U",i-1,j,m,visited,n);
        }
        visited[i][j] = false;

    }
    public static boolean isSafe(int i, int j, int[][] m, int n, boolean[][] visited){
        return (i<n && i>=0 && j<n && j>=0 && m[i][j]==1 && visited[i][j] != true);

    }


    //79. Word Search
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int coloumn = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                if(board[i][j] == word.charAt(0)){
                    if(solve(board,word,0,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;


    }
    public static boolean solve(char[][] board, String word, int index, int i, int j){

        if(index == word.length()){
            return true;
        }
        if(j>=board[0].length || i>=board.length || i<0 || j<0 || board[i][j]!= word.charAt(index)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = solve(board,word,index+1,i+1,j) || solve(board,word,index+1,i,j-1) || solve(board,word,index+1,i,j+1) || solve(board,word,index+1,i-1,j);

        board[i][j] = temp;
        return found;
    }

    //46. Permutations
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(nums,result,new ArrayList<Integer>(),used);
        return result;

    }
    public static void helper(int[] nums, List<List<Integer>> result, ArrayList<Integer> current, boolean[] used){

        if(current.size()==nums.length){
            result.add(new ArrayList<Integer>(current));
            return;
        }


        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            current.add(nums[i]);
            used[i]= true;
            helper(nums,result,current,used);
            current.remove(current.size()-1);
            used[i] = false;
        }

    }

}
