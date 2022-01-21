class Solution {
    private int max; // max index in string s
    private int low; // lowest index in string s
    public String longestPalindrome(String s) {
        int len = s.length(); // length of string
        if(len <= 1){
            return s;    
        }
        // we run starting from each character backwards and forwards
        for(int i = 0; i < len -1; i++){
            pal(s,i,i);
            pal(s,i,i+1);
        }
        // we return the substring from lowest index in the string s to the max
        //index in s
        return s.substring(low,max+low);
    }
    public void pal(String s,int a,int b){
        // this method checks whether characters behind i and after i are same or not
        while(a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)){
            a--;
            b++;
        }
        // if they are same we compute the length of the palindrome
        // and update max
        if(max < b-a-1){
            low = a + 1;
            max = b-a-1;
        }
    }
} // algorithm takes O(n^2) runtime 