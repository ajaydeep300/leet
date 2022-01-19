class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int s = 1;
        int f = 0;
        int[] ret = new int[nums.length];
        
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] % 2 == 0){
                ret[f] = nums[i];
                f += 2;
            }
            else{
                ret[s] = nums[i];
                s += 2;
            }
        }
        return ret;
    }
}