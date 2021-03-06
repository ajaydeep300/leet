class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums)
            sum += i;
        if(sum %2 != 0)
            return false;
        // if sum is not divisible by 2 then return false;
        sum = sum/2;
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;
        for(int i : nums){
            for(int j = sum;j >= i;j--){
                dp[j] = dp[j] | dp[j-i];
            }
        }
        return dp[sum];
    }
}