package sonu.com.gfg;

public class largestNumber {
    public static void main(String[] args) {
        int[] arr= {23,4,6,78,4,534,56};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {


        int n =arr.length;
        if(n == 0){
            return -1;
        }
        int lg =-1;
        int slg =-1;
        for(int i=0;i<n;i++){
            if(arr[i]>lg){
                lg = arr[i];
            }
        }

        for(int i=0; i<n;i++){
            if(arr[i]>slg && arr[i] != lg){
                slg =arr[i];
            }
        }

        return slg;


    }
}
