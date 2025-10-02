package sonu.com.gfg;

import java.util.Arrays;

public class MinimizeTheHeigth {
    public static void main(String[] args) {
        int k = 2;
        int arr[] = {1, 5, 8, 10};
        System.out.println(minimize(arr, k));
    }
    static int minimize(int [] arr, int d){

        Arrays.sort(arr);
        int n = arr.length;
        if (n == 0){
            return 0;
        }
        int greatest = arr[n-1];
        int lowest = arr[0];
        int ans = arr[n-1] - arr[0];

        for (int i = 1; i <n ; i++) {
            greatest = Math.max(arr[n-1] -d, arr[i-1] +d);
            lowest = Math.min(arr[0]+d, arr[i]+d );
            if (lowest<0){
                continue;
            }
            ans = Math.min(ans , greatest-lowest);
        }
        return ans;

    }
}
