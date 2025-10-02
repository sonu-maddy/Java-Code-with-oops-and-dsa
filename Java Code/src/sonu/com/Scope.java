package sonu.com;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        {
           // int a=78; error but we can defenitly modify it
            int c=99;
            // value initialied in this block , will remail in block.

        }

        int c=100; // initialised outside of the block.
         // System.out.println(c);  //cannot use outside the block.

        // scoping in for loop.

        for (int i=0;i<5;i++){
            System.out.println(i);
            int num=90;
             a=10;
        }
    }

    static void random(int mark){
        int num=67;
        System.out.println(num);
        System.out.println(mark);
    }
}
