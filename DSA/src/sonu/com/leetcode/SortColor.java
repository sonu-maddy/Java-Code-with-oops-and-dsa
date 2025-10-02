package sonu.com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;


// Java program to sort an array of 0s, 1s and 2s
// using Dutch National Flag Algorithm
public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,1,0,1,0,2,0};
        int[] ans = sortColors( nums);
        System.out.println(Arrays.toString(ans));
    }


//    static int[] sortColors(int[] nums) {
//        int start =0;
//        int end = nums.length-1;
//        int mid = 0;
//        while (mid<=end){
//            if (nums[mid] == 0){
//                swap(nums , mid, start);
//                start++;
//                mid++;
//            }
//            else if (nums[mid] == 1) {
//                mid++;
//            }
//            else {
//                swap(nums,mid, end );
//                end--;
//
//            }
//        }
//        return nums;
//
//    }
//    static void swap(int[] nums,int a,int b){
//        int temp = nums[a];
//        nums[a]= nums[b];
//        nums[b] = temp;
//
//    }




    // Java Program to sort an array of 0s, 1s and 2s
// by counting the occurrence of 0s, 1s and 2s
    static int[] sortColors(int[] nums) {
        int s0 =0,s1=0,s2 =0;
        int n =nums.length-1;

        for (int i = 0; i <=n ; i++) {
            if (nums[i] == 0 ){
                s0++;
            } else if (nums[i] == 1) {
                s1++;
            }
            else {
                s2++;
            }
        }

        int idx =0;

        for (int i = 0; i <s0 ; i++) {
            nums[idx++] =0;
        }

        for (int i = 0; i < s1; i++) {
            nums[idx++] = 1;
        }

        for (int i = 0; i < s2; i++) {
            nums[idx++] =2;
        }
        return nums;

    }

}
