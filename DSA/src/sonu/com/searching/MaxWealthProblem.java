package sonu.com.searching;
// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealthProblem {
    public static void main(String[] args) {
        int[][] account ={
                {2,4,5},
                {3,9,7},
                {2,3,4}
        };
        System.out.println(maximumWealth(account));

    }

    public static int maximumWealth(int[][] accounts) {

        int ans=Integer.MIN_VALUE;
        for (int person = 0; person <accounts.length; person++) {
            // when you start a new col, take a new sum for that row
            int sum=0;
            for (int account = 0; account <accounts[person].length ; account++) {
                sum += accounts[person][account];
            }

            // now we have sum of account of person
            // check the overall ans.

            if (sum > ans) {
                ans=sum;
            }
        }

        return ans;
    }

}
