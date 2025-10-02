package sonu.com.leetcode;

public class SmallestPalindromicReaarangement {
    public static void main(String[] args) {
        String s = "babab";
        System.out.println(smallestPalindrome(s));
    }
    public static String smallestPalindrome(String s) {
        int[] lettercount = new int[26];

        for(char ch : s.toCharArray()){
            lettercount[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();

        for(int i =0; i<26 ; i++){
            int count = lettercount[i];

            if(count % 2 != 0){
                mid.append((char)  (i + 'a'));
                count--;
            }

            for(int j = 0 ; j< count/2; j++){
                left.append((char) (i + 'a'));

            }

        }

        StringBuilder res = new StringBuilder();

        res.append(left);
        res.append(mid);
        res.append(left.reverse());


        return res.toString();
    }
}
