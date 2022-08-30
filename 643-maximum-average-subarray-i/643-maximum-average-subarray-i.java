class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double winSum = 0;
        for(int i = 0; i < k;i++){
            sum += nums[i];
        }
        winSum = sum;
        for(int i = k; i < nums.length; i++){
            winSum += nums[i] - nums[i-k];
            sum = Math.max(sum,winSum);
        }
        return sum/k;
    }
}