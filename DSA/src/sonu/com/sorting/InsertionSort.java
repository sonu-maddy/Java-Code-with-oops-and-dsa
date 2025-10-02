package sonu.com.sorting;


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[ ] arr ={5,3,4,1,2};
        System.out.println(Arrays.toString(insertion(arr)));

    }
    static int[] insertion(int[] arr){
        int n = arr.length;
        for (int i = 0; i <= n-2; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[i] > arr[j]){
                    swap(arr,i,j);
                    i--;
                } else if (arr[i]<arr[j]) {
                    break;
                }

            }
        }
        return arr;
    }

    static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
