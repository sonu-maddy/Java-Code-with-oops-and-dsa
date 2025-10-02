package sonu.com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int arr [ ] = {3,6,2,1,7,9,8};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }

    static int[] bubblesort(int[] arr) {
        boolean swapped = false;
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n-i ; j++) {
                if (arr[j-1]>arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] =temp;
                    swapped = true;
                }
            }
            if(!swapped){
              break;
            }
        }
        return arr;
    }

}
