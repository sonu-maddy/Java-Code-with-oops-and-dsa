package sonu.com.pattern;

public class Pattern3 {
    public static void main(String[] args) {
//        for (int row = 1; row <=5 ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int row = 1; row <=5 ; row++) {
//            for (int col = 1; col <=5-row ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        pattern(4);
    }

     static void pattern(int n) {
         for (int row = 0; row <2*n; row++) {
            int totalColINrow = row > n ? 2 * n - row : row;

             for (int col = 0; col <totalColINrow ; col++) {
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
//        * * * *
//        * * *
//        * *
//        *
