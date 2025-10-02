package sonu.com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArr {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*
          1 2 3
          4 5 6
          7 8 9

         */


      //  int[][] arr=new int [3][3];

//        int [] [] arr={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
//        System.out.println(arr[1][0]);



        // input

        int[][] arr= new int[3][2];
        System.out.println(arr.length);//no of rows


        for (int row = 0; row < arr.length; row++) {
            // for each col en every row.

            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]= in.nextInt();
            }
        }



        // output

        for (int row = 0; row < arr.length; row++) {
            // for each col en every row.

            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();

        }




//        for (int row = 0; row <arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        // enhance for loop
        for (int[] a:arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
