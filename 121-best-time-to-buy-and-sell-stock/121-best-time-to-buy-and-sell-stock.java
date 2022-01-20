class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minP = Integer.MAX_VALUE;
        for(int i : prices){
            minP = Math.min(minP, i);
            maxP = Math.max(maxP, i - minP);
        }
         return maxP;
    }
}