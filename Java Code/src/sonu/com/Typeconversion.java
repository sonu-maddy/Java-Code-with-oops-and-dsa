package sonu.com;
import java.util.Scanner;

public class Typeconversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num= input.nextFloat();
        //int num=input.nextFloat(); , this error becouse destination int is not a larger to the source type nextfloat()

        // if ur asking for the float and giving int its work.
        System.out.println(num);
    }
}
