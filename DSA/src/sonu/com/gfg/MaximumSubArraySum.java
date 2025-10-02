package sonu.com.gfg;
// kadane's algo..
public class MaximumSubArraySum {
    public static void main(String[] args) {
        int arr[] = {-2, 6, -3, -10, 0, 2};
       System.out.println(maximumSubarray(arr));
      //  System.out.println(maxProduct(arr));
    }

    // brute force aproach.

//    static int maximumSubarray(int[] arr){
//        int n = arr.length;
//        int maximum = Integer.MIN_VALUE;
//        for (int i = 0; i <n ; i++) {
//            for (int j = i; j <n ; j++) {
//                int sum = 0;
//                for (int k = i;k<=j;k++){
//                    sum += arr[k];
//                    maximum = Math.max(sum,maximum);
//                }
//            }
//        }
//        return maximum;
//
//    }


    // better aproach

//    static int maximumSubarray(int[] arr) {
//        int n = arr.length;
//        int maximum = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += arr[j];
//                maximum = Math.max(sum, maximum);
//            }
//        }
//        return maximum;
//
//    }


    // optimal aproach using kadane's algorithm

//    static int maximumSubarray(int[] arr){
//        int n = arr.length;
//        int maximum =Integer.MIN_VALUE;
//        int sum =0;
//        for (int i = 0; i <n; i++) {
//            sum += arr[i];
//
//            maximum = Math.max(sum, maximum);
//
//            if (sum < 0){
//                sum= 0;
//            }
//        }
//        return maximum;
//    }


    // maximum product Subarray of array.

//   static int maxProduct(int[] arr) {
//        // code here
//        int n = arr.length;
//        int maximum = Integer.MIN_VALUE;
//        for(int i = 0 ; i<n ; i++){
//            int product = 1;
//            for(int j= i; j<n; j++){
//
//               // if(maximum < Integer.MAX_VALUE || maximum > Integer.MIN_VALUE){
//                    product *= arr[j];
//                    maximum = Math.max(maximum,product);
//               // }
//            }
//        }
//        return maximum;
//    }



    static int maximumSubarray(int[] arr){
        int n = arr.length;
        int maximum = Integer.MIN_VALUE;
        int suffix  =1;
        int prefix = 1;
        for(int i = 0 ; i<n ; i++){

            if(suffix == 0){
                suffix =1;
            }
            if(prefix == 0){
                prefix =1;
            }

            suffix = suffix*arr[i];
            prefix = prefix*arr[n-i-1];

            if(maximum < Integer.MAX_VALUE || maximum > Integer.MIN_VALUE){

                maximum = Math.max(maximum,Math.max(suffix,prefix));
            }

        }
        return maximum;
    }
}
