package sonu.com.stringAndstringBuilderAndBuffer;

public class BasicString {
    public static void main(String[] args) {
        //way to create string

        String s1 = "A book on java";
        String s2 = new String("i ilke it");
        char arr[] = {'s','w','f','t','l'};
        String s3 = new String(arr);

        // display string
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // length of string
        System.out.println("length of s1: "+s1.length());

        // concatenate string
        System.out.println("s1 and s2 joined: "+ s1.concat(s2));

        //concat three string with +
        System.out.println(s1+" from "+ s3);

        // test if string s1 start with A
        boolean x = s1.startsWith("A");
        if (x) {
            System.out.println("string start with A");
        } else {
            System.out.println("not start with A");
        }

        // extract substring from s2, starting from 0th char to 6th char
        String p = s2.substring(0,7);

        String q = s2.substring(0,4);

        // concatenate the string p and q
        System.out.println(p+q);

        // convert s1 into uppercase and lower case
        System.out.println("upper case s1: "+s1.toUpperCase());
        System.out.println("lower case s1"+s1.toLowerCase());

    }
}
