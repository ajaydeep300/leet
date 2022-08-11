class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ret = new int[nums.length];
        int odd = 1;
        int even = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                ret[even] = nums[i];
                even = even + 2;
            }
            else{
                ret[odd] = nums[i];
                odd = odd + 2;
            }
        }
        return ret;
    }
}