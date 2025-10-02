package sonu.com.gfg;

import java.util.HashMap;

public class AngramString {
    public static void main(String[] args) {
       String  s1 = "geeks", s2 = "kseeg";
        System.out.println(angram(s1,s2));
    }
    static boolean angram(String s1 , String s2){
        HashMap<Character, Integer> chcount = new HashMap<>();
        // count feq for each char.
        for (char ch: s1.toCharArray()){
            chcount.put(ch,chcount.getOrDefault(ch,0) +1);
        }

        // delete feq for each char for s2 string
        for (char ch: s2.toCharArray()){

            chcount.put(ch, chcount.getOrDefault(ch, 0)-1);
        }

        for ( var pair : chcount.entrySet()){
            if (pair.getValue() != 0){
                return false;
            }
        }

        return true;
    }
}
