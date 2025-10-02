package sonu.com.searching;

public class FindMinNUmber {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,2};
        System.out.println(min(arr));

    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int min=arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] < min) {
                min=arr[i];
            }
        }
        return min;
    }
}
