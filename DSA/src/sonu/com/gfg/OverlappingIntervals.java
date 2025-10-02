package sonu.com.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OverlappingIntervals {
    public static void main(String[] args) {
       int  arr[][] = {{1,3},{2,4},{6,8},{9,10}};
        List<int[]> merged = mergeOverlap(arr);
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static List<int[]> mergeOverlap(int[][] arr) {

        List<int[]> ans = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return ans;
        }

        Arrays.sort(arr, Comparator.comparingInt(i -> i[0] ));



        int[] current = arr[0];

        ans.add(current);

        for (int i = 1; i < arr.length; i++) {
            int[] interval = arr[i];

            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]); // merge
            } else {
                current = interval;
                ans.add(current);
            }
        }

        return  ans;
    }
}
