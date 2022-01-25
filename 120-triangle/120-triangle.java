class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = 1;i < triangle.size();i++){
            for(int j = 0;j <= i;j++){
                int small = Integer.MAX_VALUE;
                if(j > 0)
                    small = triangle.get(i-1).get(j-1);
                if(j < i)
                    small = Math.min(small,triangle.get(i-1).get(j));
                int path = small + triangle.get(i).get(j);
                triangle.get(i).set(j, path);
            }
        }

        int len = triangle.size() - 1;
        int min = triangle.get(len).get(0);
        for(int i = 0;i <= len;i++)
            min = Math.min(min,triangle.get(len).get(i));
        return min;
    }
}