package sonu.com.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {3,1,4,5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));


       // System.out.println(missingNumber(arr));


    }

    // cyclic sort
    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }


    static void swap(int[] arr, int first, int second) {
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



    // find missing number
//    static int missingNumber(int[] arr){
//        int i = 0;
//        while (i< arr.length){
//            int correct =arr[i];
//            if (arr[i] < arr.length && arr[i] != arr[correct]){
//                swap(arr,i,correct);
//            }
//            else {
//                i++;
//            }
//        }
//        // find missing number.
//        for (int j = 0; j < arr.length ; j++) {
//            if (arr[j] != j){
//                return j;
//            }
//        }
//        return arr.length;
//    }
//
//    static void swap(int[] arr, int first, int second) {
//        int temp= arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
}
