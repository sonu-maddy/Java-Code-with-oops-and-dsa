package sonu.com.stringAndstringBuilderAndBuffer;

public class CopyStrignInArray {
    public static void main(String[] args) {
        String str = "hello, this is a book on java";
        char arr[] =new char[20];

        //copy from str into starting from 7th character to 20th character
       str.getChars(7,21,arr,0);
        System.out.println(arr);



        // string array s to store piece
        String s[];

        // split the string where a space is found in str
        s = str.split(" ");

        // display s array of string
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }

    }
}
