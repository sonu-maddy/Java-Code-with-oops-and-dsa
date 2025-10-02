package sonu.com.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=5 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=5-row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//        *
//        * *
//        * * *
//        * * * *
//        * * * * *


//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *


//        * * * *
//        * * *
//        * *
//        *
