package sonu.com.stringAndstringBuilderAndBuffer;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <26 ; i++) {
            char ch  = (char) ('a' + i);
            builder.append(ch);

        }

        System.out.println(builder.toString());
        System.out.println(builder.deleteCharAt(1));
        System.out.println(builder.delete(1,4));
        System.out.println(builder.reverse());
    }
}
