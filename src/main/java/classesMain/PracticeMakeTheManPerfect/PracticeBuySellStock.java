package classesMain.PracticeMakeTheManPerfect;

import java.util.Arrays;

public class PracticeBuySellStock {

    public static void main(String[] args) {
        int[] prices =  {7,1,5,3,6,1,4};
        System.out.println(getBestDaysToBuyAndSellToGetMaxProfit(prices));
    }

    private static int getBestDaysToBuyAndSellToGetMaxProfit(int[] prices) {
        int[] indices = new int[2];
        int profit = 0;
        if(prices.length == 0) {
            return 0;
        }

        int minValue = prices[0];
        indices[0] = minValue;

        for (int i = 0; i<prices.length; i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
                indices[0] = prices[i];
            } else {
                if(prices[i]-minValue > profit) {
                    profit =Math.max(profit, prices[i]-minValue);
                }
                indices[1] = prices[i];
            }
            System.out.println(Arrays.toString(indices));
        }
        // get two indices
        return profit;
    }
}
