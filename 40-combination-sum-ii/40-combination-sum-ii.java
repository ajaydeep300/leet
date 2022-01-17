class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(candidates);
        generateList(candidates,target,ret,new ArrayList<>(),0);
        return ret;
    }
    public void generateList(int[] c,int t,List<List<Integer>> ret, List<Integer> temp, int start){
        if(t < 0) return;
        else if(t == 0)
            ret.add(new ArrayList<>(temp));
        for(int i = start; i< c.length;i++){
            if(i > start  && c[i] == c[i-1]) continue;
            temp.add(c[i]);
            generateList(c,t-c[i],ret,temp,i+1);
            temp.remove(temp.size() - 1);

        }
    }
}