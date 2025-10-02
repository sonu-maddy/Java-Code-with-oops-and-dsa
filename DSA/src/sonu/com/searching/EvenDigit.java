package sonu.com.searching;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums={18,124,9,1764,9,1};
        System.out.println(findNumber(nums));
    }

     static int findNumber(int[] nums) {
        int count =0;
         for (int i = 0; i <nums.length ; i++) {
             if (even(nums[i])){
                 count++;
             }
         }
         return count;
    }

    static boolean even(int i) {
        int numberofdigit = digit(i);

        if (numberofdigit % 2 == 0){
            return true;
        }
        return false;
    }


    static int digit(int i) {
        int count=0;

        while (i>0){
            count++;
            i=i/10;
        }
        return count;
    }



}
