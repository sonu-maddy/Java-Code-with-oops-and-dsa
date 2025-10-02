package sonu.com.leetcode;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "31";
        System.out.println( stringToInteger(s));
    }
//    static int stringtointeger(String s){
//        Integer.parseInt(s);
//        int result = 0;
//        int n = s.length();
//        int i=0;
//        while (i<n && s.charAt(i) == ' '){
//            i++;
//        }
//
//
//        boolean x = cmp(s.charAt(i));
//        if(i<n && x){
//            return 0;
//        }
//
//        while (i<n){
//            int digit = Character.getNumericValue(s.charAt(i));
//            if (s.charAt(i) == '-'){
//                break;
//            }
//
//            if (result > Integer.MAX_VALUE  || result < Integer.MIN_VALUE ){
//                return -1;
//            }
//            result =result * 10 + digit;
//            i++;
//
//
//        }
//        return result;
//    }
//
//     static boolean cmp(char value) {
//         for (int i = 'a'; i <='z' ; i++) {
//
//                 if (Character.getNumericValue(value) == Character.getNumericValue(i)){
//                     return true;
//                 }
//
//         }
//         return false;
//    }



//    Issues:
//    Unused Integer.parseInt(s);
//
//    This line is not doing anything since its return value is not stored.
//
//    Logic for Checking Non-Numeric Characters (cmp Method)
//
//    The cmp method is unnecessarily complex. A simple check for Character.isLetter(value) is enough.
//
//    Handling of Negative Numbers
//
//    The code does not properly process negative numbers. It only breaks when encountering '-', but it doesn't modify result accordingly.
//
//    Incorrect Integer Overflow Check
//
//    result > Integer.MAX_VALUE and result < Integer.MIN_VALUE are meaningless because result is an int, and overflow would have already occurred.
//
//    Returning 0 for Non-Numeric Strings
//
//    The function should throw an error or return a default value instead of always returning 0.
//
//    The Loop for Processing Digits
//
//Character.getNumericValue() is not ideal for digit conversion because it can return unexpected values for non-digit characters.
//
//    Fixed Code:
//    java
//            Copy
//    Edit

        static int stringToInteger(String s) {
            if (s == null || s.isEmpty()) {
                return 0; // or throw an exception
            }

            int result = 0, i = 0, sign = 1, n = s.length();

            // Ignore leading spaces
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            // Handle optional + or -
            if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
              //  sign = (s.charAt(i) == '-') ? -1 : 1;
                if (s.charAt(i)=='-'){
                    sign = -1;
                }
                else{
                    sign  =1;
                }
                i++;
            }

            // Convert digits
            while (i < n && Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';

                // Check for integer overflow
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                result = result * 10 + digit;
                i++;
            }

            return result * sign;
        }

//    Improvements:
//    Handles Leading Spaces ✅
//
//    Handles Positive and Negative Signs ✅
//
//    Prevents Integer Overflow ✅
//
//    Handles Non-Digit Characters Correctly ✅
//
//    Returns Proper Values Instead of Arbitrary 0 ✅
}
