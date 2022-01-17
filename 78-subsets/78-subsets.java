class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        // create a list of list which is to be returned
        generateList(ret,new ArrayList<>(),0,nums);
        // call helper function which adds subsets one at a time through recursion
        return ret;
    }
    public void generateList(List<List<Integer>> list,List<Integer> temp,int start,int[] a){
        list.add(new ArrayList<>(temp)); //we add a copy of our temp list each time so 
        //[[],[1],[1,2]...]
        for(int i = start;i < a.length; i++){
            temp.add(a[i]);
            generateList(list,temp,i+1,a);
            temp.remove(temp.size() - 1);
            }
    }
}