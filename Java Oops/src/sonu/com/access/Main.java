package sonu.com.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj =new A(15,"sonu");
        // need to do a few things
        // 1. access the data members
        //2. modify the data members

//        ArrayList<Integer> list =new ArrayList<>();
//        list.DEFAULT_CAPACITY;

        obj.getNum();
        int n = obj.num;
        // this is not allow in diff packege but in the same packege it is allow.in public access


    }
}
