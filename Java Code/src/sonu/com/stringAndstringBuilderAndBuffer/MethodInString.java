package sonu.com.stringAndstringBuilderAndBuffer;

import java.util.Arrays;

public class MethodInString {
    public static void main(String[] args) {
        String name = "sonu maddheshiya";

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toUpperCase());

        System.out.println(name.indexOf('d'));

        System.out.println(name.equalsIgnoreCase("maddheshiya"));

        System.out.println(Arrays.toString(name.split(" ")));

        System.out.println("sonu".strip());
    }
}
