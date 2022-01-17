class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> que = new LinkedList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        // find all 0 values and then run bfs on each 0 value
        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j < mat[0].length;j++){
                if(mat[i][j] == 0){
                    que.add(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        int step = 1;// increment if neighbors by 1 if they are not visited 
        while(!que.isEmpty()){
            int s = que.size();
            for(int i = 0; i < s; i++){
            int[] point = que.poll();
            for(int[] d : dir){
                int x = point[0] + d[0];
                int y = point[1] + d[1];
                if(x < 0 || y < 0 || x >= mat.length || y >= mat[0].length || visited[x][y] == true)
                    continue;
                else{
                    visited[x][y] = true;
                    mat[x][y] = step;
                    que.add(new int[]{x,y});
                }
            }
        }
        step++ ;
    }
        return mat;
    }
}