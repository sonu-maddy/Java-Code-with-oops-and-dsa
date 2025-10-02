package sonu.com.recursion;

public class FactorialNum {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }

    // sum of n number;
    static int sum(int n){
        if(n <= 1){
            return 1;
        }
        return n * sum(n-1);
    }
}
