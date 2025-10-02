package sonu.com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={5,4,1,3,2};
        System.out.println(Arrays.toString(selectionsort(arr)));
    }

     static int[] selectionsort(int[] arr) {
         for (int i = 0; i < arr.length ; i++) {
             int last = arr.length-i-1;
             int maxindex = maxindex( arr,0,last);
             swapelement(arr,maxindex,last);
         }

         return arr;


    }

    static void swapelement(int[] arr, int maxindex, int last) {
        int temp = arr[maxindex];
        arr[maxindex] =arr[last];
        arr[last] = temp;
    }

    static int maxindex(int arr[],int start, int end) {
        int max =0;
        for (int i = 0; i <end; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
