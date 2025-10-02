package sonu.com.gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class DistictNumber {
    static ArrayList<Integer> findDistinct(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

//        for (int i = 0; i < arr.length; i++) {
//
//
//            int j;
//            for (j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    break;
//                }
//            }
//            if (i == j) {
//                res.add(arr[i]);
//            }
//        }




        // using sorting technic
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n ; i++) {
           if (i == 0 || arr[i] != arr[i-1]){
               res.add(arr[i]);
           }
        }


        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};

        ArrayList<Integer> res = findDistinct(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
