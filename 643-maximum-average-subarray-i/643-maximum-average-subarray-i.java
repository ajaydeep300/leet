class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int win_sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        // solution by sliding window
        // we add first k numbers
        // we then find window with the max sum, therefore we substract the left most element and add the righ most element from the sum
        // finally we return average with with the maximum sum/k
        win_sum = sum;
        for(int i = k; i < nums.length;i++){
            win_sum += nums[i] - nums[i - k];
            sum = Math.max(sum, win_sum);
        }
        return (double)sum/k;
    }
}