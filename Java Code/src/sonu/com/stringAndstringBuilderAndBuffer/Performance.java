package sonu.com.stringAndstringBuilderAndBuffer;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i <26 ; i++) {
            char ch  = (char) ('a' + i);
            series += ch;  // bad way becouse here create many obj and after ref next prev obj are garbage.
            System.out.println(ch);  // so in this case we can use stringbuilder.
        }

        System.out.println(series);
    }
}
