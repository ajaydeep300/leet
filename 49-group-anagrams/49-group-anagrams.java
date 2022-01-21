class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String, List<String>> result = new HashMap<>();
        for(String s: strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            if(result.containsKey(key)){
                result.get(key).add(s);
            }
            else{
                result.put(key, new ArrayList<>());
                result.get(key).add(s);
                
            }
        }
        return new ArrayList<>(result.values());
    }
}