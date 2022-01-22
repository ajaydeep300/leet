class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0];
        int min = nums[0];
        int ret = max;
        for(int i = 1; i < nums.length; i++){
            int cur = nums[i];
            int temp = Math.max(cur,Math.max(max*cur,min*cur));
            min =  Math.min(cur,Math.min(max*cur,min*cur)); // this will solve the case for -2*3*-4
            max = temp;
            ret = Math.max(max,ret);
        }
        return ret;
    }
        
}