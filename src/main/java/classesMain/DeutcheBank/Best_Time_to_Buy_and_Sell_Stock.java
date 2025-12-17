package classesMain.DeutcheBank;

import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock {
    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    //Example 1:
    //Input: prices = [7,1,5,3,6,4]
    //Output: 5
    //Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    //Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
    //Example 2:
    //
    //Input: prices = [7,6,4,3,1]
    //Output: 0
    //Explanation: In this case, no transactions are done and the max profit = 0.
    //
    public static void main(String[] args) {
//        int[] prices =  {7,6,4,3,1};
        int[] prices =  {7,1,5,3,6,1,4};
        System.out.println(Best_Time_to_Buy_and_Sell_Stock.findBestDays(prices)) ;
    }

    private static int findBestDays(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int minimumValue = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < minimumValue) {
                minimumValue = prices[i];
            } else  {
                if(prices[i] - minimumValue > profit) {
                    profit = Math.max(profit, prices[i] - minimumValue);
                }
            }
       }

       return profit;
    }
}



// complexity
//       for (int i = 0; i<prices.length -1; i++) {
//           for (int j = i+1; j< prices.length; j++) {
//                   if(prices[j] > prices[i]) {
//                       profit = Math.max(profit, prices[j] - prices[i]);
//                   }
//           }
//       }