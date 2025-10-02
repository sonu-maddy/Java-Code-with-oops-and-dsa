package sonu.com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {

       String  arr[] = {"act", "god", "cat", "dog", "tac"};
        System.out.println(anagrams(arr));
    }


    public static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        if(arr == null || arr.length ==0){
            return new ArrayList<>();
        }

        Map<String, ArrayList<String>> freqstrmap = new HashMap<>();

        for(String str : arr){
            String freqstr = getFrequencyString(str);

            if(freqstrmap.containsKey(freqstr)){
                freqstrmap.get(freqstr).add(str);
            }else{
                ArrayList<String> strlist = new ArrayList<>();
                strlist.add(str);

                freqstrmap.put(freqstr, strlist);
            }
        }

        return new ArrayList<>(freqstrmap.values());
    }

    public static String  getFrequencyString(String str){
        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder freqstr = new StringBuilder("");
        char c = 'a';

        for(int i: freq){
            freqstr.append(c);
            freqstr.append(i);
            c++;
        }

        return freqstr.toString();
    }
}
