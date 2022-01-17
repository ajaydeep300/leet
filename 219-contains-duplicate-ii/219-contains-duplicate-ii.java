class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // brute force 
        //        sort them using counting sort 
        // then remove duplicates using 2 pointer 
        // we can use hash map to store the array value and the indexes for the the other condition 
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i =0;i < nums.length; i++){
            if(h.containsKey(nums[i]) && i - h.get(nums[i]) <= k)
                return true;
            else
                h.put(nums[i], i);
            }
        return false;
    }
}