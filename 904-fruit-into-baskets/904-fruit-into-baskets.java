class Solution {
    // max contiguous subarray with only 2 fruits 
    public int totalFruit(int[] fruits) {
        // 2 unique fruits
        // maximum amount of fruits to be filled in the basket while keeping the uniqueness to 2
        HashMap<Integer,Integer> ha = new HashMap<>();
        int start =0,end = 0,len = 0;
        // we continue adding fruits into a hash map until a third fruit comes up where we have to stop iterating and update the max length of the subarray, after that we delete the first fruit to continue oue evalutaion with the third fruit in hopes of getting a new max subarray.
        while(end < fruits.length){
            int val = fruits[end];
            ha.put(val,ha.getOrDefault(val,0) + 1);
            end++;
            while(ha.size() > 2){
                int rem = fruits[start];
                ha.put(rem, ha.get(rem) - 1);
                if(ha.get(rem) == 0){
                    ha.remove(rem);
                }
                start++;
            }
            len = Math.max(len, end - start);
        }
        return len;
    }
}