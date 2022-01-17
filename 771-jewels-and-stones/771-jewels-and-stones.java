class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ret = 0;
        HashMap<Integer, Character> ha = new HashMap<Integer, Character>();
        for(int i = 0; i< jewels.length();i++){
            ha.put(i,jewels.charAt(i));
        }
        for(int i = 0; i< stones.length();i++){
            if(ha.containsValue(stones.charAt(i)))
                ret += 1;
        }
        return ret;
    }
}