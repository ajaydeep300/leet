class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        // iterate through all the indexes and recurse dfs,if an island(1) is surrounded by 0 then it counts as an island
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                dfs(grid,i,j);
                count += 1;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid,int i,int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
            return;
        // mark all the 1s by 2 so that we do not count it again
        if(grid[i][j] == '1'){
            grid[i][j] = '2';
            dfs(grid, i+1,j);
            dfs(grid, i,j+1);
            dfs(grid, i-1,j);
            dfs(grid, i,j-1);
        }
    }
}