class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ret = new int[nums.length];
        HashMap<Integer,Integer> ha = new HashMap<Integer,Integer>();
        int[] clon = nums.clone();
        Arrays.sort(clon);
        // we sort a clone nums array
        for(int i = 0;i < clon.length;i++){
            if(ha.containsKey(clon[i]))
                continue;
            else
                ha.put(clon[i],i);
        }
        // we then add unique elements and their index to the hashmap therefore we dont have to worry about duplicate elemnts.
        
        for(int i = 0;i < nums.length;i++){
            ret[i] = ha.get(nums[i]);
        }
        // we return values of every key 
        return ret;
    }
}