package sonu.com.leetcode;

public class SearchMountainArray {
    public static void main(String[] args) {
        int[] mountainarr = {1,2,3,4,5,3,1};
        int target = 2;

        int ans = findInmountainArray(target,mountainarr);
        System.out.println(ans);
    }

    public static int findInmountainArray(int target,int[] mountainarr) {



            int peak = peakIndexInMountainArray(mountainarr);
            int start = 0;
            int firstIdx = orderAgnosticBS(mountainarr,target,start,peak);
            if (firstIdx != -1){
                return firstIdx;
            }
            return orderAgnosticBS(mountainarr,target,peak,mountainarr.length-1);


    }

    static int peakIndexInMountainArray(int[] arr) {
        int s =0;
        int e = arr.length-1;
        while(s!=e){
            int mid = s + (e - s)/2;
            if(arr[mid] >arr[mid+1]){
                e = mid;
            }
            else{
                s = mid+1;
            }
        }
        return s;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {


        // Check if the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }
}
