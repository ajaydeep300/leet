class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length + 1];// new table with size prices.length + 1
        dp[0] = 0;// intialize to 0
        for(int i = 1; i < prices.length;i++){
            // fill table by adding last index element and profit if positive
            dp[i] = dp[i-1] + Math.max(0,prices[i] - prices[i-1]);
        }
        return dp[prices.length - 1];
    }
}