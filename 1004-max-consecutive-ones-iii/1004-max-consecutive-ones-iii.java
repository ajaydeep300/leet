class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0,end = 0, max = 0, z = k;
        // we flip the amount of 0's and then continue calculating max
        // when all flips are finished, we increment start whereever the value says 0
        // solution by sliding window
        while(end < nums.length){
            if(nums[end] == 1)
                end++;
            else if(nums[end] == 0 && z > 0){
                end++;
                z--;
            }
            else{
                max = Math.max(max , end -start);
                if(nums[start] == 0) z++;
                start++;
            }
    }
        max = Math.max(max,end-start);
        return max;
}
}