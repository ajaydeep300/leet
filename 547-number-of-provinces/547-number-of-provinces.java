class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visit = new boolean[isConnected.length];
        int out = 0;
        for(int i = 0; i < isConnected.length;i++){
                if(visit[i] == false){
                    dfs(isConnected,visit,i);
                    out+=1;
                }
            }
        return out;
    }
    public void dfs(int[][] ar,boolean[] v,int i){
        for(int x = 0; x < ar.length;x++){
            if(ar[i][x] == 1 && v[x] == false){
                v[x] = true;
                dfs(ar,v,x);
            }
        }
    }
}