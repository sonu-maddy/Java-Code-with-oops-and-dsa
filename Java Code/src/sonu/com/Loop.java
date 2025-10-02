package sonu.com;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        // syntax of for loop
        // for(initialization;conditon;increment/decrement){
        //  body
        // }

        //Q. Print number from 1 to 10.

//        for (int num=1; num<=10; num+=1){
//            System.out.println(num);
//        }

 //       int n =in.nextInt();

//        for (int i = 1; i <=n; i++) {
//            System.out.println(i);
//        }
//
        //while loop
//        int num =1;
//        while (num<=5){
//            System.out.println(num);
//            num+=1;
//        }


        // do while loop
        int num =1;
        do {
            System.out.println(num);
            num+=1;
        }while (num<=5);
    }
}
