class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ret = new ArrayList<>();
        generateList(ret,new ArrayList<>(), k,n,1);
        return ret;
        }
    public void generateList(List<List<Integer>> ret,List<Integer> temp, int k , int n , int start){
        if(temp.size() == k && n == 0){
            ret.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i <= 9 ; i++){
            temp.add(i);
            generateList(ret,temp,k,n-i,i+1);
            temp.remove(temp.size() - 1);
        }

    }
}