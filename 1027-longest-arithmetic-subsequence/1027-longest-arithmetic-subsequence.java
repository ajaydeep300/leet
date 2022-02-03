class Solution {
    public int longestArithSeqLength(int[] nums) {
        int out = 0;
        HashMap<Integer,Integer>[] dp = new HashMap[nums.length];
        for(int i = 0; i < nums.length;i++){
            dp[i] = new HashMap();
            for(int j = 0;j < i;j++){
                int diff = nums[i] - nums[j];
                dp[i].put(diff, dp[j].getOrDefault(diff,1) + 1); // we increment the number by one each time we find the same difference 
                out = Math.max(out, dp[i].get(diff));
            }
        }
        return out;
    }
}