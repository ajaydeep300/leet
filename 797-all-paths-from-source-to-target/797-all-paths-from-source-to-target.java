class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ret = new ArrayList<>();
        Queue<List<Integer>> que = new LinkedList<>();
        List<Integer> tem = new ArrayList<>();
        tem.add(0);
        que.add(tem);
        while(!que.isEmpty()){
            tem = que.remove();
            int x = tem.get(tem.size() - 1);
            if(x == graph.length - 1){
                ret.add(new ArrayList<>(tem));
                continue;
            }
            for(int i : graph[x]){
                List<Integer> cur = new ArrayList<>(tem);
                cur.add(i);
                que.add(cur);
            }
        }
        return ret;
    }
}