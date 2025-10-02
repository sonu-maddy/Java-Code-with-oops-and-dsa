package sonu.com.recursion;

public class SumOfDigit {
    public static void main(String[] args) {
       // int ans = sum(3421);
        int ans = product(3421);
        System.out.println(ans);
    }
    static int sum(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }

    static int product(int n){
        if (n%10  == n){
            return n;
        }
        return (n%10) * product(n/10);
    }
}
