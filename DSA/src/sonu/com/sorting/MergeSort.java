package sonu.com.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {3,7,1,9,3,6,8};
//        arr = mergesort(arr);
//        System.out.println(Arrays.toString(arr));

         mergesortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
//    static int [ ] mergesort(int[] arr){
//        if (arr.length == 1){
//            return arr;
//        }
//
//        int mid  = arr.length/2;
//        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
//        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
//
//        return merge(left, right);
//    }
//
//    static int[] merge(int[] first, int[] second) {
//        int[] mixarr = new int[first.length+ second.length];
//
//        int i =0;
//        int j =0;
//        int k =0;
//        while (i < first.length && j< second.length){
//            if (first[i]<second[j]){
//                mixarr[k] = first[i];
//                i++;
//            }else {
//                mixarr[k] = second[j];
//                j++;
//            }
//
//            k++;
//        }
//        while (i < first.length){
//            mixarr[k] = first[i];
//            k++;
//            i++;
//        }
//
//        while (j < second.length){
//            mixarr[k] = second[j];
//            k++;
//            j++;
//        }
//        return mixarr;
//    }


// mergesort in place without creating new array.
    static void mergesortInPlace(int[] arr , int start ,int end){
        if (end - start == 1){
            return;
        }

        int mid  = (start + end)/2;
        mergesortInPlace(arr,start,mid);
        mergesortInPlace(arr,mid,end);

         merge(arr, start,mid, arr.length);
    }

    static void merge(int[] arr, int s,int m, int e) {
        int[] mixarr = new int[e-s];

        int i =s;
        int j =m;
        int k =0;
        while (i < m && j< e){
            if (arr[i]<arr[j]){
                mixarr[k] = arr[i];
                i++;
            }else {
                mixarr[k] = arr[j];
                j++;
            }

            k++;
        }
        while (i < m){
            mixarr[k] = arr[i];
            k++;
            i++;
        }

        while (j < e){
            mixarr[k] = arr[j];
            k++;
            j++;
        }

        System.arraycopy(mixarr, 0, arr, s + 0, mixarr.length);

        // same things.
//        for (int l = 0; l < mixarr.length ; l++) {
//            arr[s+l] = mixarr[l];
//        }

    }
}
