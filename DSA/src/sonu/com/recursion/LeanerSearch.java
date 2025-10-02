package sonu.com.recursion;

public class LeanerSearch {
    public static void main(String[] args) {
        int arr[] = {32,5,2,7,92,67,3,45};
        System.out.println(find(arr, 72,0));
        System.out.println(findIndex(arr, 92,0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if( arr[index] == target){
            return index;
        }else {
            return findIndex(arr, target, index+1);
        }

    }
}
