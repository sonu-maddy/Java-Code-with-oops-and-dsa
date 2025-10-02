package sonu.com.stringAndstringBuilderAndBuffer;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');  //195    take ascaii value
        System.out.println("a"+"b");  //ab
        System.out.println('a' + 3);   // 100
        System.out.println((char) ('a'+3));   // d

        System.out.println("a" + 1); //a1
        // this is same as after a few steps "a" + "1"
        // Integer will be converted to Integer that will call toString()

        System.out.println("kunal" + new ArrayList<>());   // kunal[]

        System.out.println("sonu"+new Integer(23));  //sonu23
        String ans =new Integer(23) +""+ new ArrayList<>();
        System.out.println(ans);
    }

}
