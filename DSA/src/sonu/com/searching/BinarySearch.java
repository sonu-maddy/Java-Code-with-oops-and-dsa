package sonu.com.searching;

// binary search always work on the sorting array.

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-17,-12,-4,0,2,3,4,15,16,19,23,33,45,56,67};
        int target=16;
        int ans=BinarySearch(arr,target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int target){
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
        return -1;
    }
}
