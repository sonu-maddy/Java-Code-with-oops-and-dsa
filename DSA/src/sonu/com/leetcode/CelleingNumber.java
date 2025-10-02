package sonu.com.leetcode;

public class CelleingNumber {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,12,15,17,18,20};
        int target=16;
        int ans= celliengnumber(arr,target);
        System.out.println(ans);
    }

    // return index : greatest number >= target
    static int celliengnumber(int[] arr, int target){

        if (target > arr[arr.length - 1]){
            return -1;
        }

        int start=0;
        int end = arr.length-1;
        while (start<=end){
            //  int mid=(start+end)/2; // might be possible that (start+end) exceed the range of integer.


            int mid = start +(end- start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                // ans found.
                return mid;

            }
        }
        return start;
    }
}
