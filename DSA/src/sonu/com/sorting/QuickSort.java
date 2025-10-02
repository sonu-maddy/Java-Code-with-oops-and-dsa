package sonu.com.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {10,35,5,9,2,93,6,3};
        quickSort(arr, 0 , arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("," + arr[i]);
        }
    }
    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            //find the partition
            int partition = findPartition(arr, start, end);

            // do quick sort on the left part
            quickSort(arr, start,partition-1);

            // do quick sort on the right part
            quickSort(arr, partition+1,end);
        }
    }

    private static int findPartition(int[] arr, int start, int end) {
        int pivot = arr[end];

        int i = (start-1);

        for (int j = 0; j < end; j++) {
            if (arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }


        }

        swap(arr, i+1, end);

        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
