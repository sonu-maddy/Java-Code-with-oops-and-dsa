package sonu.com;


import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();

        boolean ans=isArmstrong(n);
        System.out.println(ans);


        // print all the 3 digit Armstrong number.
        for (int i=1000;i<1000000;i++){
            if (isArmstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }

    static boolean isArmstrong(int n)
    {

//        String str = String.valueOf(n);

        String str = Integer.toString(n);

//        String str = n + "";

        int dSize=str.length();

        int original=n;
        double sum=0;
        while (n>0){
            int rem=n%10;
            n=n/10;

//             sum=sum+rem*rem*rem*rem;
            sum=sum+Math.pow(rem,dSize);
        }
        if (sum==original){
            return true;
        }

        return false;
    }
}
