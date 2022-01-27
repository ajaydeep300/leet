class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        // create dp
        dp[0] = true;
        // intialize
        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j <= i; j++){
                // check if previous dp is true for characters in string
                if(dp[j] == true){
                    // if the dict contains the substring then update dp[i] by setting it to true
                    if(wordDict.contains(s.substring(j,i)) == true){
                        dp[i] = true;
                        // break loop since there is no need to move forward
                        // start i again for the next word
                        // since previous values are true in dp it wont matter
                        break;
                    }
                }
            }
        }
        return dp[s.length()];
    }
}