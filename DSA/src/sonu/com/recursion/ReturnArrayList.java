package sonu.com.recursion;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[ ] arr = {23,75,34,67,763,75,75,45};
        ArrayList<Integer> list = new ArrayList<>();
        findAllIndex(arr,75,0,list);
        System.out.println(list);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if( arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr, target, index+1,list);

    }

    // without passing arraylist argument.
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        if( arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target, index+1);

        list.addAll(ansFromBelowCalls);
        return list;

    }
}
