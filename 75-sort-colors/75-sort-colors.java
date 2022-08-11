class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                zero += 1;
            else if(nums[i] == 1)
                one += 1;
            else
                two += 1;
        }
        for(int i = 0; i < nums.length ; i++){
            if(i < zero)
                nums[i] = 0;
            else if(i < (zero + one))
                nums[i] = 1;
            else
                nums[i] = 2;
        }
        // if index is less than the assigned counter for minimum value then nums[index] = value
        //similarly for the other values
        
/*      // brute force using count sort algorithm
        int[] c = new int[3];
        for(int i = 0;i < nums.length;i++){
            c[nums[i]] = c[nums[i]] + 1;
        }
        // we create array with space 3(since r,g,b) then we increment each index by 1 for counting 0,1,2
        for(int j = 1; j< c.length;j++){
            c[j] = c[j] + c[j-1];
        }
        // we then add previous index and current index in the newly created array
        
        int[] b = new int[nums.length];
        for(int k = 0; k < nums.length ;k++){
            b[c[nums[k]]-1] = nums[k];
            c[nums[k]] = c[nums[k]] - 1;
        }
        // finally we create a new array with space nums.length and assign each index the proper sorted colour order 
        return b;
        */
    }
}