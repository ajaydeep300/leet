class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int area = 0;
        int h = 0;
        int left = 0;
        int right  = (height.length -1);
        // we use 2 pointers left and rigght at each end
        // we calculate area by length * breadth where length = right-left and breadth is minimum height among the 2 vertical lines
        while(left < right){
            area = (right-left)*(Math.min(height[left],height[right]));
            if(max < area)
              max = area;
            if(height[right] < height[left])
              right--;
            else
              left++;
        }
        return max;       
    }
}