class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> que = new LinkedList<>();
        int total =0;
        // we add all the rotten oranges in a queue first
        for(int i = 0; i < grid.length; i ++){
            for(int j = 0 ; j < grid[0].length;j++){
                if(grid[i][j] != 0)
                    total += 1;
                if(grid[i][j] == 2)
                    que.add(new int[] {i,j});
            }
        }
        if(total == 0)
            return 0;
        int rotten = 0;
        int count = 0;
        while(!que.isEmpty()){
            int size = que.size();
            rotten += size;
            if(rotten == total) return count;
            count += 1;
            // we added another for loop because we want to each loop when oranges start rotting and not how many number of oranges rot
            for(int x = 0 ; x< size; x++){
                int[] point = que.poll();
                int i = point[0];
                int j = point[1];
                if(i > 0 && grid[i - 1][j] == 1){
                    grid[i-1][j] = 2;
                    que.add(new int[] {i-1,j});
                }
                if(i < grid.length -1 && grid[i+1][j] == 1){
                    grid[i+1][j] = 2;
                    que.add(new int[] {i+1,j});
                }
                if(j > 0 && grid[i][j-1] == 1){
                    grid[i][j-1] = 2;
                    que.add(new int[] {i,j-1});
                }
                if(j < grid[0].length -1  && grid[i][j + 1] == 1){
                    grid[i][j+1] = 2;
                    que.add(new int[] {i,j+1});
                }

            }
        }
        return -1;
     }
}