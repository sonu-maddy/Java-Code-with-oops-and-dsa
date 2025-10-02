
package sonu.com.array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        ArrayList<Integer> list= new ArrayList<>();

        list.add(45);
        list.add(23);
        list.add(32);
        list.add(65);
        list.add(423);
        list.add(23532);

       boolean a= list.contains(32);
        list.set(0,100);

        list.remove(4);

        System.out.println(a);

        System.out.println(list);

        
        // input

//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }


        // get item at any index.

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here , list [index ] syntax will not work here.

        }



    }
}
