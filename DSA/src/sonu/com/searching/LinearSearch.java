package sonu.com.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {2,6,8,32,97,23,12};
        int target=78;
        int ans=linearsearch(arr,target);

        System.out.println(ans);

    }


    // search the array : return the index if item found.
    // otherwise if item not found return -1.

    static int linearsearch(int[] arr, int target){
       if (arr.length==0){
           return -1;
       }

        for (int i = 0; i <arr.length ; i++) {
            int element=arr[i];
            if (element == target) {
                return i;
            }
        }

        // target not found.
        return -1;
    }

}
