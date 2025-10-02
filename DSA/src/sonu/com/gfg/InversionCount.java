package sonu.com.gfg;

public class InversionCount {
    public static void main(String[] args) {

       int  arr[] = {2, 4, 1, 3, 5};
        System.out.println(inversion(arr,0, arr.length-1));
    }

    // brute force aproch

//    static int inversionCount(int arr[]) {
//        // Your Code Here
//        int count=0;
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i] > arr[j]){
//                    count +=1;
//                }
//            }
//        }
//        return count;
//    }



    // optimal solution using merge sort.

    static int inversion(int[] arr, int start, int end) {
        if (end - start <= 1) {
            return 0;
        }

        int mid = (start + end) / 2;

        int left = inversion(arr, start, mid);
        int right = inversion(arr, mid, end);
        int count = merge(arr, start, mid, end);

        return left + right + count;
    }

    static int merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start, j = mid, k = 0;
        int count = 0;

        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                mix[k++] = arr[i++];
            } else {
              mix[k++] = arr[j++];
                count += (mid - i); // inversion count
            }
        }

        while (i < mid) {
            mix[k++] = arr[i++];
        }

        while (j < end) {
            mix[k++] = arr[j++];
        }

        System.arraycopy(mix, 0, arr, start, mix.length);
       //  same things.
//        for (int l = 0; l < mix.length ; l++) {
//            arr[start+l] = mix[l];
//        }


        return count;
    }

}
