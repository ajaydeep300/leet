class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        //^ above line is the return array
        HashMap<Integer,Integer> ha = new HashMap<Integer,Integer>();
// we declare a hash map and put the difference of target and the elements in the hash map as values and then assign the index as values
        for(int i = 0; i< nums.length ; i++){
            if(ha.containsKey(target - nums[i])){
                ret[0] = ha.get(target - nums[i]);
                ret[1] = i;
                return ret;
            }
           ha.put(nums[i],i);  
        }
        return ret;
    }
}