package sonu.com.leetcode;

public class FindIndexOfFirstOccurenceInString {
    public static void main(String[] args) {
        String haystack = "absafdbutsad";
        String needle= "sad";
        int ans=firstOccurence(haystack,needle);
        System.out.println(ans);


    }

    static int firstOccurence(String haystack, String needle) {

        int h =haystack.length();
        int n = needle.length();
        for (int i = 0; i <=h-n ; i++) {
            int j;
            for ( j = 0; j <n; j++) {

                if (haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }

            }
            if (n == j){
                return i;
            }

        }
        return -1;
    }



}



