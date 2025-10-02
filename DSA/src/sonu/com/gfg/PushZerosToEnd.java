package sonu.com.gfg;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {3,5,0,0,4};
        arr=pushZerosToEnd(arr);
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(" "+ arr[i]);
        }
    }
    static int[] pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int[] temp =new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[count] = arr[i];
                count++;
            }
        }
        while(count<n){
            temp[count++] = 0;
        }

        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }

        return arr;
    }
}
