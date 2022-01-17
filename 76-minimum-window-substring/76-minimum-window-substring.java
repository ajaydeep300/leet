class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> ha = new HashMap<>();
        for(int i = 0; i < t.length();i++){
            char c = t.charAt(i);
            ha.put(c, ha.getOrDefault(c,0) + 1);
            }
        // we put all the charcaters and their number of apperances into a hash map
        int start = 0, end = 0, min = s.length();
        int left = 0, right = s.length()- 1;
        int count = ha.size();
        boolean found = false;
        // we continue the fast index(end) until all the characters appear
        while(end < s.length()){
            char c = s.charAt(end);
            if(ha.containsKey(c)){
                ha.put(c, ha.get(c) - 1);
                if(ha.get(c) == 0) 
                    count--;
            }
            end++;
            
            if(count > 0) continue; // the continue command will jump into the next iteration 
            
        // when all the characters appear in the sub string we move the start index until count >0
        // so that we can start calculating the new minimum length
            while(count == 0){
                char ch = s.charAt(start);
                if(ha.containsKey(ch)){
                    ha.put(ch,ha.get(ch) + 1);
                    if(ha.get(ch) > 0)
                        count++;
                }
                start++;
            }
            if(end -start < min){
                left = start;
                right = end;
                found = true;
                min = end - start;
                
            }
        }
        return found ? s.substring(left- 1, right) : "";
    }
}