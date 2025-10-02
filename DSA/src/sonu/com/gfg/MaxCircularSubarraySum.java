package sonu.com.gfg;

public class MaxCircularSubarraySum {
//    public static void main(String[] args) {
//        int arr[] = {1,-2,3,-2};
//        System.out.println(circularSubarraySum(arr));
//    }
//    public static int circularSubarraySum(int arr[]) {
//        int maxsum = 0;
//        int minsum = 0;
//        int totalsum = 0;
//        for(int i = 0; i<arr.length; i++){
//            totalsum += arr[i];
//            minsum = Math.min(minsum , arr[i]);
//            maxsum = Math.max(maxsum , maxsum+arr[i]);
//        }
//
//        if(maxsum<totalsum){
//            return maxsum;
//        }
//        else{
//            return totalsum - minsum;
//        }
//    }



    // using chat gpt


        public static void main(String[] args) {
            int arr[] = {1,-2,3,-2};
            System.out.println(circularSubarraySum(arr));
        }

        public static int circularSubarraySum(int arr[]) {
            int totalSum = 0;
            int maxSum = arr[0];
            int currMax = arr[0];
            int minSum = arr[0];
            int currMin = arr[0];

            for (int i = 1; i < arr.length; i++) {
                currMax = Math.max(arr[i], currMax + arr[i]);
                maxSum = Math.max(maxSum, currMax);

                currMin = Math.min(arr[i], currMin + arr[i]);
                minSum = Math.min(minSum, currMin);

                totalSum += arr[i];
            }
            totalSum += arr[0]; // because we skipped arr[0] in the loop

            if (maxSum < 0) {
                return maxSum; // all elements are negative
            }

            return Math.max(maxSum, totalSum - minSum);
        }


}
