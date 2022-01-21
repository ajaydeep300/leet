class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        // declare table
        for(int i = 1; i < dp.length;i++){
            dp[i] = dp.length;
            //fill table with the given amount
            for(int j = 0; j < coins.length;j++){
                if(i >= coins[j])// if amount is greater than denomination value then
                    dp[i] = Math.min(dp[i],dp[i-coins[j]] + 1);
                // dp[i] is the minimum of amount or (amount - denomination) + 1
            }
        }
        if(dp[amount] == dp.length)
            // if not possible then return -1
            return -1;
        else
            return dp[amount];
    }
}