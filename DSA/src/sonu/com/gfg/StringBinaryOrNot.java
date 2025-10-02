package sonu.com.gfg;

public class StringBinaryOrNot {
    public static void main(String[] args) {
        String s ="101011g0101";
        char sa[] = s.toCharArray();

        for (int i = 0; i <sa.length ; i++) {
            if ( sa[i] !='0' && sa[i] != '1' ){
                System.out.println("string is a not binary form");
                return;
            }
        }
        System.out.println("string is a binary number ");
    }
}
