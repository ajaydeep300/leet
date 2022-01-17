class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int slow = 0;
        for(int fast = 1; fast< nums.length;fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        // array is sorted in ascending order hence we can compare elements using 2-pointers
        }
        return slow + 1;
    }
}