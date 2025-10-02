package sonu.com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitive
        int[] arr=new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= in.nextInt();
        }

      //  System.out.println(Arrays.toString(arr));


        for (int j : arr) { // for every element in array , print the element.
            System.out.print(j + " "); // here j represent element of the array.

        }




        // array of objects
        String[] str= new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
