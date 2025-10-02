package sonu.com.array;

import java.util.Arrays;

public class SwapArrayElement {
    public static void main(String[] args) {
        int [] arr = {1,3,5,8,6,2,9};

      //  swap(arr, 1,4);

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }


    // reverse array.
//     static void reverse(int[] arr){
//        int start= 0;
//        int end=arr.length-1;
//
//        while (start<end){
//            swap(arr,start,end);
//            start++;
//            end--;
//
//
//        }
//
//     }



     // swap to array element.

//    static void swap(int[] arr, int index1,int index2){
//        int temp = arr[index1];
//         arr[index1]= arr[index2];
//         arr[index2]= temp;
//    }

    public static void reverse(int arr[]) {
        // code here
        int n = arr.length-1;
        for(int i = 0; i<=n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
    }
}
