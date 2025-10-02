package sonu.com.gfg;

import java.util.ArrayList;

public class KMPAlgorithm {

    public static ArrayList<Integer> KMPSearch(String pat, String txt) {
        int n = pat.length();
        int m = txt.length();
        int[] lps = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        // Preprocess the pattern to create LPS array
        for (int i = 1, len = 0; i < n;) {
            if (pat.charAt(i) == pat.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        // Search the pattern in the text
        for (int i = 0, j = 0; i < m;) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
                if (j == n) {
                    list.add(i - j); // Match found
                    j = lps[j - 1];  // Continue to check for next matches
                }
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String text = "ababcababcabc";
        String pattern = "abc";
        ArrayList<Integer> result = KMPSearch(pattern, text);
        System.out.println("Pattern found at indices: " + result);
    }
}








//package sonu.com.gfg;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class SearchPatternKMPAlgorithm {
//    public static void main(String[] args) {
//       String txt = "aabaacaadaabaaba", pat = "aaba";
//        ArrayList<Integer> res = search(pat,txt);
//        System.out.println(res);
//    }
//    static ArrayList<Integer> search(String pat, String txt) {
//        // your code here
//        int n =pat.length();
//        int m = txt.length();
//        int[] lps =new int[n];
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 1,len=0; i < n;) {
//            if (pat.charAt(i) == pat.charAt(len)){
//                lps[i++] = ++len;
////                len++;
////                i++;
//            } else if (len>0) {
//                len=lps[len-1];
//            }
//            else {
//                lps[i++] =0;
//            }
//        }
//
//        for (int i = 0, j =1; i < m; ) {
//            if (txt.charAt(i ) == pat.charAt(i)){
//                i++;
//                j++;
//                if (j == n){
//                    list.add(i-j);
//                    j =lps[j-1];
//                }
//            } else if (j>0) {
//                j = lps[j-1];
//            }
//            else {
//                i++;
//            }
//        }
//
//        return list;
//    }
//}
