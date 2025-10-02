
package sonu.com;
import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch=in.next().trim().charAt(0);

        // trim are basically remove the extra space.
        // charAt return the only charecter type and 0 are the index value which can return.


        // Q. check lower case or upper case.
        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }

        System.out.println(ch);

    }
}
