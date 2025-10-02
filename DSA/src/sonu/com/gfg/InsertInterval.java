package sonu.com.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {

       int[][] intervals = {{1,3}, {4,5}, {6,7}, {8,10}};
       int[] newInterval = {6,10};
        List<int[]> result = insertInterval(intervals, newInterval);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        int n = intervals.length;
        int i =0;
        List<int[]> ans = new ArrayList<>();

        while (i<n && intervals[i][1] < newInterval[0] ){
            ans.add(intervals[i]);
            i = i+1;
        }

        while (i<n && intervals[i][0] <newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0] );
            newInterval[1] = Math.max(newInterval[1], intervals[i][1] );
            i = i+1;
        }
        ans.add(newInterval);

        while (i<n){
            ans.add(intervals[i]);
            i=i+1;
        }

        return (ArrayList<int[]>) ans;

       // int[][] insert(int[][] intervals, int[] newInterval)
      //  in this case return this type to
        // return ans.toArray(new int[ans.size()][]);
    }
}
