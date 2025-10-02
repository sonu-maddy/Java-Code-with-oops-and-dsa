package sonu.com.stringAndstringBuilderAndBuffer;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a =453.1274f;
//        System.out.println("formatted number is %.2f",a);

        System.out.printf("formatted number is %.2f",a); // 453.13

//        System.out.println(Math.PI); // 3.141592653589793
        System.out.printf("Pie: %.3",Math.PI);

        System.out.printf("hello my name is %s and %s ", "sonu","vinit");
    }
}

//%c - Character
//%d - Decimal number (base 10)
//%e - Exponential floating-point number
//%f - Floating-point number
//%i - Integer (base 10)
//%o - Octal number (base 8)
//%s - String
//%u - Unsigned decimal (integer) number
//%x - Hexadecimal number (base 16)
//%t - Date/time
//%n - Newline

