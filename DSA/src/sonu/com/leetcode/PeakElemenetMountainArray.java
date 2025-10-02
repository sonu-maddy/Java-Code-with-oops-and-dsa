package sonu.com.leetcode;

public class PeakElemenetMountainArray {
    public static void main(String[] args) {
        int[] arr= {1,3,5,7,9,5,2,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
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
}
