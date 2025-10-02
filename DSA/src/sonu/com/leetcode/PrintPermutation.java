package sonu.com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutation {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<List<Integer>> ans  =new ArrayList<>();
        permutation(nums,ans);
        System.out.println(ans);
    }
    public static List<List<Integer>> permutation(int [] nums, List<List<Integer>> ans){
       // List<List<Integer>> ans  =new ArrayList<>();
        printpermutation(0, nums, ans);

        return ans;
    }

    static void printpermutation(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length-1){
            List<Integer> ds = new ArrayList<>();

            for (int i = 0; i < nums.length ; i++) {
                ds.add(nums[i]);
            }

            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int j = index; j < nums.length ; j++) {
            swap(j,index,nums);
            printpermutation(index+1, nums,ans);
            swap(j,index,nums);
        }

    }

    static void swap(int j, int index, int[] nums) {
        int temp = nums[j];
        nums[j] = nums[index];
        nums[index] = temp;

    }
}
