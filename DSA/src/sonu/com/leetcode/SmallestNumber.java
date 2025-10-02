package sonu.com.leetcode;

public class SmallestNumber {
    public static void main(String[] args) {
        char letters[] = {'s','w','f','t','l'};

        char target='f';
        char ans= nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
   static public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end = letters.length-1;
        while (start<=end){
            //  int mid=(start+end)/2; // might be possible that (start+end) exceed the range of integer.


            int mid = start +(end- start)/2;
            if (target<letters[mid]){
                end=mid-1;
            }
            else if (target>letters[mid]) {
                start=mid+1;
            }

        }
        return letters[start % letters.length];
    }

}
