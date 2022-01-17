class Solution {
    public void sortColors(int[] nums) {
        int i = 0,j = 0,k = 0;
        for(int a = 0;a< nums.length;a++){
            if(nums[a] == 0) i++;
            else if(nums[a] == 1) j++;
            else k++;
        }
        // we count the number of times 0,1,2 appear
        for(int a = 0;a<nums.length;a++){
            if(a < i) nums[a] = 0;
            else if(a < i+j) nums[a] = 1;
            else nums[a] = 2;
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