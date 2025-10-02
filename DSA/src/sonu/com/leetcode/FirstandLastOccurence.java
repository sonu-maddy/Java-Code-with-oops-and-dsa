package sonu.com.leetcode;

public class FirstandLastOccurence {
    public static void main(String[] args) {
        int[] nums = {1,2,5,8,8,8,8,9,10};
        int target = 8;
        int[] finalans = searchRange(nums,target);
        for (int i = 0; i <= finalans.length-1 ; i++) {
            System.out.print(finalans[i]);
            System.out.print(" ");
        }
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] arr ={-1,-1};

        arr[0]=searchindex( nums, target,true );
        if (arr[0] != -1){
            arr[1]=searchindex( nums, target,false);
        }


        return arr;

    }

    static int searchindex(int[] nums, int target, boolean startindex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            //  int ans;

            if(target<nums[mid]){
                end = mid - 1;
            }
            else if(target>nums[mid]){
                start = mid + 1;
            }
            else{

                ans = mid;

                if(startindex){
                    end  = mid - 1;
                }
                else{
                    start = mid + 1;

                }
            }
        }
        return ans;
    }
}
