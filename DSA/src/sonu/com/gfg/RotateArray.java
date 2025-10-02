package sonu.com.gfg;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {8,4,8,2,0,1,3,7};
        int target =2;
        System.out.println(Arrays.toString(rotateArr(arr,target)));
    }
        static int[] rotateArr(int arr[], int d) {
            int j=0;
            d = d % arr.length;
            int[] temp = new int[arr.length];

            for(int i = d;i<arr.length;i++){

                temp[j] = arr[i];
                j++;
            }
            for(int i = 0; i<d; i++){
                temp[j]=arr[i];
                j++;
            }

            for(int i = 0;i<arr.length;i++){
                arr[i] = temp[i];
            }
            return arr;
        }


}
