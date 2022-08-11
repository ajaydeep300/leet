class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int start = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[start] != nums[i]){
                start += 1;
                nums[start] = nums[i];
            }
            
        }
        return start + 1;
    }
}