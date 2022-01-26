class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        // if there is only one element then the return the first element
        int[] dp = new int[nums.length];
        // declare a new dp array
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        //initialize
        for(int i = 2;i < nums.length;i++){
                dp[i] = Math.max(nums[i] + dp[i-2],dp[i-1]);
        }
        // run loop and get the maximum of last dp element and the sum of 2 elements before 
        return dp[nums.length -1];
    }
}