package sonu.com.gfg;

import java.util.Arrays;

public class NextPrmutation {
    public static void main(String[] args) {
       int[] arr = {3,2,1};
        System.out.println(Arrays.toString(nextPermutation(arr)));
    }
    static int[] nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int idx =-1;
        for(int i = n-2; i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx = i;
                break;
            }

        }
        if (idx == -1) {
            return reverse(arr);
        }
        for(int i =n-1; i>=idx;i--){
            if(arr[i]> arr[idx]){
                swap(arr,i,idx);
                break;
            }
        }
        for (int i = idx+1; i <n-1 ; i++) {
            swap(arr,i,n-1);
            n--;
        }



        return arr;
    }
   static void swap(int[] arr, int i, int idx){
        int temp = arr[i];
           arr[i]= arr[idx];
           arr[idx] =temp;
    }

    static int[]  reverse(int[] arr){
        int n = arr.length-1;
        for (int i = 0; i <=n/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
        return arr;
    }
}
