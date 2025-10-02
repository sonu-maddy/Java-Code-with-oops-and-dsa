package sonu.com;

import java.util.Arrays;

// variable length argument.
public class VarArgs {
    public static void main(String[] args) {
        fun( 2,3,4,5,6,7,8);

        multiple(2,4,"sonu","vinit");
    }

    static void multiple(int a, int b,String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
