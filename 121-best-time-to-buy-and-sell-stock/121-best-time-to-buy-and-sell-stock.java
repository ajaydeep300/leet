class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minP = Integer.MAX_VALUE;
        for(int i : prices){
            if (minP > i)
                minP = i;
            else if(maxP < (i-minP))
                maxP = i - minP;
        }
         return maxP;
    }
}