class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(candidates);
        generateList(candidates,target,new ArrayList<>(),ret,0);
        return ret;
    }
    public void generateList(int[] cand, int target,List<Integer> temp, List<List<Integer>> ret,int start){
        if(target < 0) return;
        else if(target == 0)
            ret.add(new ArrayList<>(temp));
        for(int i = start; i < cand.length; i++){
            temp.add(cand[i]);
            generateList(cand,target-cand[i],temp,ret,i); // we will recurse with the remaining target and starting index will remain the same since a number can be added multiple times
            temp.remove(temp.size() - 1);
        }
    }
}