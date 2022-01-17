class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ha = new HashSet<>();
        int one = nums1.length;
        int two = nums2.length;
        HashSet<Integer> ret = new HashSet<>();
        for(int i = 0; i < one;i++){
                ha.add(nums1[i]);
        }
        for(int i = 0;i < two;i++){
            if(ha.contains(nums2[i]))
                ret.add(nums2[i]);
        }
        int[] re = new int[ret.size()];
        int i = 0;
        for(Integer e : ret)
            re[i++] = e;
        return re;
        
    }
}