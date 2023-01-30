package Medium;

public class BuyAndSell2_122 {
    public static void main(String[] args) {
        BuyAndSell2_122 answerer = new BuyAndSell2_122();
        System.out.println(answerer.maxProfit(new int[]{1,9,6,9,1,7,1,1,5,9,9,9}));
    }

    public int maxProfit(int[] prices) {
        int max = prices[0], min = prices[0];
        int maxSum = 0, currentSum = 0;

        for (int i = 1; i < prices.length; i++){
            if(prices[i] >= max) {
                currentSum = prices[i] - min;
                max = prices[i];
                if (i == prices.length - 1){
                    maxSum += currentSum;
                }
            } else if (prices[i] < prices[i-1]){
                min = prices[i];
                max = prices[i];
                maxSum += currentSum;
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
