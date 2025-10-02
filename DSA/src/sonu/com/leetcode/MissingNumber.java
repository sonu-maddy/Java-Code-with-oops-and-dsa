package sonu.com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3};
        System.out.println(missingnum(arr));
    }


    // using sum of n number formula.


    static int missingnum(int[] arr) {
//        int n = arr.length+1;
//       int sum = n*(n-1)/2;
//       int sum2= 0;
//        for (int i = 0; i < arr.length ; i++) {
//            sum2 += arr[i];
//        }
//        return sum-sum2;


        // using hash array
        int n = arr.length;
        int[] hash = new int[n + 1];  // include space for n

        // Fill the hash array for values in the range [1, n]
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                hash[arr[i]] = 1;
            }
        }

        // Find the first index with 0 (i.e., missing number)
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // If all 1 to n are present, then the missing number is n+1
        return n + 1;


    }
}