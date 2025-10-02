package sonu.com;

import java.util.Arrays;

public class ChangeValueMethod {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,6};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changeArr(int[] nums) {
        nums[0]=99;
    }
}
