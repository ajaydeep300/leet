class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] adj = new ArrayList[numCourses];
        for(int i = 0; i< numCourses; i++){
            adj[i] = new ArrayList();
        }
        for(int[] p : prerequisites){
            adj[p[0]].add(p[1]);
        }
        int[] check = new int[numCourses];
        for(int i = 0;i < numCourses;i++){
            if(!dfs(check,adj,i))
                return false;
        }
        return true;
    }
    private boolean dfs(int[] c,ArrayList[] a, int course){
        if(c[course] == 1) 
            return false;
        else if(c[course] == 2)
            return true;
        else
            c[course] = 1;
        for(int i = 0;i< a[course].size();i++){
            if(!dfs(c,a,(int)a[course].get(i)))
                return false;
        }    
        c[course] = 2;
        return true;
    }
}