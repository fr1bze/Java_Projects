class MaxProfit {
    public int maxProfit(int[] prices) {
        int maXProfit = 0;
        int minVal = prices[0];
        for (int i = 1;i < prices.length;i++)
        {
            if (minVal > prices[i])
                minVal= prices[i];
            if (prices[i] - minVal > maXProfit)
                maXProfit = prices[i] - minVal;
        }
        return maXProfit;
    }
}