package sonu.com.recursion;

public class Basic {
    public static void main(String[] args) {
        // write a function that print hello world
        massage();
    }

    static void massage() {
        System.out.println("hello world");
        massage1();
    }
    static void massage1() {
        System.out.println("hello world");
        massage2();
    }
    static void massage2() {
        System.out.println("hello world");
        massage3();
    }
    static void massage3() {
        System.out.println("hello world");
        massage4();
    }
    static void massage4() {
        System.out.println("hello world");
    }
}
