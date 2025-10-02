package sonu.com.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 123;
        System.out.println( reverseint(num));
    }

    static int reverseint(int num) {



            int ans = 0;
            while (num != 0){
                int rem = num % 10;
                num /=10;

                if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE/10){
                    return 0;
                }

                ans = ans * 10 + rem;
            }
            return ans;
    }
}
