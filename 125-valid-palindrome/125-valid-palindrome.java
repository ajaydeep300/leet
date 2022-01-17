class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        if(s.isEmpty()) return true;
        while(i<=j){
        if(!Character.isLetterOrDigit(s.charAt(i))){
            i++;
        }
            // check if character is a letter or digit, if not then increment index from left by 1
        else if(!Character.isLetterOrDigit(s.charAt(j))){
            j--;
        }
            // check if character is a letter or digit, if not then decrement ind3x from right by 1
        else{
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;      
        }
        // check if characters are equal or not, if not then return false else update index to check the next characters
    }
             return true;
 }
}