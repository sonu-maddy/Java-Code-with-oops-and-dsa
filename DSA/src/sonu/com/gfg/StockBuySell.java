package sonu.com.gfg;

public class StockBuySell {
    public static void main(String[] args) {
       int  prices[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maximumProfit(prices));
    }

    public static int maximumProfit(int prices[]) {
        // code here
//        int n = prices.length;
//        int profit = 0;
//        for(int i = 1; i<n; i++){
//            if(prices[i] > prices[i-1]){
//                profit += (prices[i] - prices[i-1]);
//            }
//        }
//        return profit;





        // with one transaction
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++){
            minprice = Math.min(prices[i],minprice);
            maxprofit = Math.max(maxprofit,prices[i] - minprice);
        }
        return maxprofit;
    }
}
