package sonu.com.leetcode;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 3;
        System.out.println(search(nums,target));
    }

    static int search(int[] nums, int target){
        int start=0;
        int end = nums.length-1;
        int pivot =  findpivot(nums);

        if (pivot == -1){
            return binarysearch(nums,start,end,target);
        }

        if (nums[pivot]== target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarysearch(nums,0, pivot-1,target);
        }

        return binarysearch(nums,pivot+1, nums.length-1, target);
    }

    static int binarysearch(int[] nums,int start, int end , int target){


        while (start<=end){

            int  mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid-1;
            }
            else if (target > nums[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

   static int findpivot(int nums[]){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // If left half is sorted, pivot must be in the right half
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
