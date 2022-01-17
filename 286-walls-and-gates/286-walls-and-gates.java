class Solution {
    public void wallsAndGates(int[][] rooms) {
        // apply bfs
        if(rooms.length == 0) return;
        int empty = Integer.MAX_VALUE;
        Queue<int[]> que = new LinkedList<>();
        for(int i = 0;i < rooms.length;i++){
            for(int j = 0 ; j < rooms[0].length;j++){
                if(rooms[i][j] == 0)
                    que.add(new int[] {i,j});
            }
        }
        // add all the gates with value 0 to a queue
        while(!que.isEmpty()){
            // empty queue and discover all the neighbors
            int[] point = que.poll();
            int r = point[0];
            int c = point[1];
            if(r < 0 || c< 0 || r >= rooms.length || c >= rooms[0].length)
                continue;
            if(r > 0 && rooms[r-1][c] == empty){
                rooms[r - 1][c] = rooms[r][c] + 1;
                que.add(new int[]{r-1,c});
            }
            if(r < rooms.length - 1 && rooms[r+1][c] == empty){
                rooms[r + 1][c] = rooms[r][c] + 1;
                que.add(new int[]{r+1,c});
            }
            if(c > 0 && rooms[r][c -1] == empty){
                rooms[r][c - 1] = rooms[r][c] + 1;
                que.add(new int[]{r,c - 1});
            }
            if(c < rooms[0].length - 1 && rooms[r][c+1] == empty){
                rooms[r][c + 1] = rooms[r][c] + 1;
                que.add(new int[]{r,c + 1});
            }

        }
    }
}