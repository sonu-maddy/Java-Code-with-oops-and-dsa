package sonu.com.searching;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-17, -12, -4, 0, 2, 3, 4, 15, 16, 19, 23, 33, 45, 56, 67};
        int target = 0;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Check if the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];
        // same as
//        if (arr[start]<arr[end]){
//            isAsc = true;
//        }
//        else {
//            isAsc = false;
//        }

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
