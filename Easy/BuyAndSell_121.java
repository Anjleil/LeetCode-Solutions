package Easy;

import java.util.Arrays;

public class BuyAndSell_121 {
    public int maxProfit(int[] prices) {
        int max = prices[0], min = prices[0];
        int maxSum = 0, currentSum = 0;
        for (int i = 1; i < prices.length; i++){
            if(prices[i] > max) {
                currentSum = prices[i] - min;
                max = prices[i];
            } else if ( prices[i] < min){
                min = prices[i];
                max = prices[i];
            }
            if (maxSum < currentSum)
                maxSum = currentSum;
        }
        return maxSum;
    }
}
