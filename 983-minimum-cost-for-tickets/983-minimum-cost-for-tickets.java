class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int max = days[days.length - 1];
        int[] dp= new int[max + 1];
        HashSet<Integer> s = new HashSet<>();
        for(int i : days)
            s.add(i);
        for(int i = 1;i < dp.length;i++){
            int a = dp[i-1];
            int b = (i - 7) > 0 ? dp[i-7] : 0;
            int c = (i - 30) > 0 ? dp[i-30] : 0;
            if(s.contains(i))
                dp[i] = Math.min(costs[0]+a , Math.min(costs[1] + b, costs[2] + c));
            else
                dp[i] = dp[i-1];
        }
        return dp[dp.length - 1];
    }
}