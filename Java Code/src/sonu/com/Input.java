package sonu.com;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in) ;
//        System.out.println("pls enter some input");
//        int rollno= input.nextInt();
//        System.out.println("Your roll is "+rollno);


       // int a=10;
        // a is identifire and name of the variables , class, packege,method are also called identifire.

        //int a=234,000,000;
        //here comma are not allow so we can put underscore on this and underscore are replace by comma.
        int a=234_000_000;
        System.out.println(a);

        String name=input.nextLine();// next() for first word
        System.out.println(name);

        float mark= input.nextFloat();
        System.out.println(mark );
    }
}
