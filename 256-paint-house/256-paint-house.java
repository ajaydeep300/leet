class Solution {
    public int minCost(int[][] costs) {
        int n = costs.length;
        if(n == 0)
            return 0;
        // we add the minimum of the previous index costs[i-1][] to the current colour index so that no 2 colors are same
        for(int i = 1; i < n; i++){
            costs[i][0] += Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0],costs[i-1][1]);
        }
        return Math.min(costs[n-1][0],Math.min(costs[n-1][1],costs[n-1][2]));
    }
}