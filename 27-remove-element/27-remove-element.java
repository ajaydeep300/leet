class Solution {
    public int removeElement(int[] nums, int val) {
        int point = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != val){
                nums[point] = nums[i];
                point += 1;
            }
        // we use 2 pointer, if the fast pointer is not equal to the value then we ignore it thus we get an array without the element
            
        }
        return point;
    }
}