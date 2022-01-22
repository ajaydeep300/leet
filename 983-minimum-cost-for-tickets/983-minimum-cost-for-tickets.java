class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int max = days[days.length - 1];
        // max represents the last day of travel or max day of travel
        int[] dp= new int[max + 1];
        // we make a new array with size = max; which incluedes non travelling days as well
        HashSet<Integer> s = new HashSet<>();
        // add all travelling days to the hash set
        for(int i : days)
            s.add(i);
        for(int i = 1;i < dp.length;i++){
            // a,b,c are the values of previous indexes a = i-1, b = i-7, c = i-30
            // if i-7, i-30 are negative then we take value 0 otherwise dp[i-7]or dp[i-30]
            int a = dp[i-1];
            int b = (i - 7) > 0 ? dp[i-7] : 0;
            int c = (i - 30) > 0 ? dp[i-30] : 0;
            if(s.contains(i))
                // choose minimum out of the these costs
                dp[i] = Math.min(costs[0]+a , Math.min(costs[1] + b, costs[2] + c));
            else
                // non travelling days have the same costs of travel
                dp[i] = dp[i-1];
        }
        return dp[dp.length - 1];
    }
}