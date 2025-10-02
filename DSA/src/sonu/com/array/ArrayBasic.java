package sonu.com.array;

public class ArrayBasic {
    public static void main(String[] args) {

        //syntax
        // datatype[] variable_name = new datatype[size];
        //store 5 roll number.
        //  int[] roll =new int[5];

          // or directly

        // int[] roll={32,45,56,31};

        int[] roll; // declaration of array. roll is getting defined in the stack.
        roll=new int[5]; // initialisation actually here object is being created in the memory in heap.

        System.out.println(roll[2]);


        String[] arr=new String[5];
        System.out.println(arr[2]); //print NULL

       // String str=null; you can assign only non primitive.
        // int num = null; error, you can't assign any primitive


    }
}
