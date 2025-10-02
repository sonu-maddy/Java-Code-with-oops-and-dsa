package sonu.com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
       char[] s = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverseString(s)));
    }

    static char[] reverseString(char[] s) {
        int n = s.length-1;
        for (int i = 0; i <=n/2 ; i++) {
            char temp = s[i];
            s[i] = s[n-i];
            s[n-i] = temp;
        }
        return s;
    }

}
