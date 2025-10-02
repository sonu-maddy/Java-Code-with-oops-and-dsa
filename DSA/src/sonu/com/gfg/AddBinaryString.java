package sonu.com.gfg;

import java.util.Arrays;

public class AddBinaryString {
    public static void main(String[] args) {
       String s1 = "1101", s2 = "111";
        System.out.println(addBinary(s1,s2));

    }

    public static String addBinary(String s1, String s2) {
        String ans = "";
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int count = carry;

            if (i >= 0 && s1.charAt(i) == '1') {
                count++;
            }

            if (j >= 0 && s2.charAt(j) == '1') {
                count++;
            }

            if (count % 2 == 0) {
                ans = '0' + ans;
            } else {
                ans = '1' + ans;
            }


            carry = count / 2;

            i--;
            j--;
        }

        if (carry == 1) {
            ans = '1' + ans;
        }

        return ans;
    }

}


//String ans = "";
//int i = s1.length() - 1;
//int j = s2.length() - 1;
//int carry = 0;
//        while (i >= 0 || j >= 0) {
//int count = 0;
//carry = 0;
//        if (s1.charAt(i) == 1) {
//count++;
//        }
//        if (s2.charAt(j) == 1) {
//count++;
//        }
//        if (count + carry == 1) {
//ans += '1';
//carry = 0;
//        }
//        else if (count + carry == 2) {
//ans += '0';
//carry = 1;
//        }
//        else if (count + carry == 3) {
//ans += '1';
//carry = 1;
//        }
//        else if (count + carry == 0) {
//ans += '0';
//count = 0;
//        }
//        }
//        if (carry == 1) {
//ans += '1';
//        }
//        //ans = Integer.toString(Integer.parseInt(ans));
//
//        return ans;
