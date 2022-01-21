class Solution {
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
/*        HashMap<Integer,Integer> mem = new HashMap<>();
        mem.put(1,1);
        mem.put(2,2);
        return add(n,mem);
    }
    public int add(int n,HashMap<Integer,Integer> memo){
        if(memo.containsKey(n))
            return memo.get(n);
        memo.put(n,add(n-1,memo) + add(n-2,memo));
        return memo.get(n);

    }
    */
}