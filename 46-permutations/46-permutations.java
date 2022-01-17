class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        // create a list of list which is to be returned
        generateList(ret,new ArrayList<>(),nums);
        // call helper function which adds subsets one at a time through recursion
        return ret;
    }
    public void generateList(List<List<Integer>> list,List<Integer> temp,int[] a){
        if(temp.size() == a.length)
            list.add(new ArrayList<>(temp)); //do not add until we get a permutation of size=array.size
        for(int i = 0;i < a.length; i++){
            if(temp.contains(a[i])) continue;// if a list contains an element then reiterate the loop 
            temp.add(a[i]); // add element if it is not added before
            generateList(list,temp,a);// recurse 
            temp.remove(temp.size() - 1);
            }
    }
}