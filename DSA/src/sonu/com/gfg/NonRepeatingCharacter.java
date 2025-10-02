package sonu.com.gfg;

import java.util.ArrayList;
import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRepeatingChar(s));
    }
//   public static char nonRepeatingChar(String s) {
//
//        HashMap<Character,Integer> chcount = new HashMap<>();
//
//        for(char ch: s.toCharArray()){
//
//            chcount.put(ch, chcount.getOrDefault(ch,0)+1);
//
//        }
//
//        for(var pair : chcount.entrySet()){
//            if(pair.getValue() == 1){
//                return pair.getKey();
//            }
//        }
//
//        return '$';
//    }

    public static char nonRepeatingChar(String s) {

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c -'a']++;
        }

        for (char c : s.toCharArray()){
            if (freq[c- 'a'] == 1 ){
                return c;
            }
        }

        return '$';
    }
}
