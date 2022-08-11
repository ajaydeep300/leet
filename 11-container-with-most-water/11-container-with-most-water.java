class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int area = 0;
        int start = 0;
        int end = height.length -1;
        while(start < end){
        area = (end-start)*(Math.min(height[end],height[start]));
            if(area > max)
                max = area;
            else if(height[end] > height[start])
               start++;
            else
               end--;
        }
        return max;
    }
}