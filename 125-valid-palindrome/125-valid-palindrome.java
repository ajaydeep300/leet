class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        if(s.isEmpty())
            return true;
        while(start <= end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start += 1;
            }
            else if(!Character.isLetterOrDigit(s.charAt(end))){
                end -= 1;
            }
            else{
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                else{
                    start += 1;
                    end -= 1;
                }
            }
        }    
        return true;
 }
}