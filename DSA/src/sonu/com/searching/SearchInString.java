package sonu.com.searching;

import java.util.Arrays;

// linear search question.

public class SearchInString {
    public static void main(String[] args) {
        String name = "Sonu Maddheshiya";
        char target='M';

        System.out.println(search(name,target));

        for (char ch:name.toCharArray()){
            if (ch == target) {
                System.out.println(Arrays.toString(name.toCharArray()));
            }
        }
    }

    static boolean search(String str, char target) {
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }



        return false;
    }
}
