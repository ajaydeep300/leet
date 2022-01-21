class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> mem = new HashMap<>();
        mem.put(1,1);
        mem.put(2,2);
        return add(n,mem);
    }
    public int add(int n,HashMap<Integer,Integer> memo){
        if(memo.containsKey(n))
            return memo.get(n);
        memo.put(n,add(n-1,memo) + add(n-2,memo));
        return memo.get(n);

    }
}