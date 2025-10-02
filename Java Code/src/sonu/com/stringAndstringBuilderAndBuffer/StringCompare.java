package sonu.com.stringAndstringBuilderAndBuffer;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");


        // obj created by jvm it return memory address of obj as a hexadecimal num, it called obj reference
        // when a new obj are created , a new reference num is alloted to it.
        // every obj have a unique reference
        if (s1 == s2){
            System.out.println("both are the same string");

        }else {
            System.out.println("not same string");
        }


        // using .equels() method
        // compare its original value , not a reference number.

        if (s1.equals(s2)) {
            System.out.println("these are the same string");
        }else
            System.out.println("not the string");






        // let some change in the earlier program
        // jvm create a string obj and store "hello " in it. here we are not using new keyword to create the string.
        // we using = assign operator , so after creating str obj , jvm uses a separate block of memory.
        // which memory is called string constant pool. and store the obj there.
        String s3 ="hello";
        String s4 ="hello";
        if (s4 == s3) {
            System.out.println("both are same");
        }


        // immutable of string
        // join the s3 and s4 and store in s3.
        s3 =s3+s4;
        System.out.println(s3);

//
//        int i =1;
//        if (s4.equalsIgnoreCase(s3[i])) {
//
//        }
    }
}
