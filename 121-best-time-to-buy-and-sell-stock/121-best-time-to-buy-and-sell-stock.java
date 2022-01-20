class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minP = Integer.MAX_VALUE;
        for(int i : prices){
            minP = Math.min(minP, i); // update min price of stock if lower than original
            maxP = Math.max(maxP, i - minP); // simeltaneously update the price the max profit 
        }
         return maxP;
    }
}