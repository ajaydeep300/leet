class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        Set<Character> ha = new HashSet<>();
        // declare a hash set
        int start = 0, end = 0, len = 0;
        // while a character doesnt appear again, add char to hashset and update length by hashset size
        while(end < s.length()){
            char c = s.charAt(end);
            if(!ha.contains(c)){
                ha.add(c);
                end++;
                len = Math.max(len, ha.size());
            }
            // if a char appears again we remove the start index and increment start index by 1 to move our sliding window
            else{
                char r = s.charAt(start);
                ha.remove(r);
                start ++;
            }
        }
        return len;
    }
}