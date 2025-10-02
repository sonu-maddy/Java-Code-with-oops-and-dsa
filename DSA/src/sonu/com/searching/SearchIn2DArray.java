package sonu.com.searching;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [] [] arr = {
                {12,34,6},
                {3,7,2,50},
                {9,23,69},
                {236,4,74,5}
        };

        int target=5;
        int[] ans= Search(arr,target); // format value {row , col}
        System.out.println(Arrays.toString(ans));


        // find the max value

        System.out.println(maxValue(arr));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }




    static int[] Search(int[][] arr, int target) {
        for (int row = 0; row <= arr.length-1; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target) {
                    return new int[]{row,col};

                }
            }
        }
        return new int[]{-1,-1};
    }



    // find max value in 2d array.

    static int maxValue(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for (int row = 0; row <= arr.length - 1; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];

                }
            }
        }
        return max;
    }
}
