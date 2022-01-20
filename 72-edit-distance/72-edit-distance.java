class Solution {
    public int minDistance(String word1, String word2) {
        int x = word1.length();
        int y = word2.length();
        int[][] dp = new int[x+1][y+1];
        //declare table
        for(int i = 0; i <= x;i++)
            dp[i][0] = i;
        for(int i = 0; i <= y ; i++)
            dp[0][i] = i;
        // intialize
        //fill table
        for(int i = 1; i <= x;i++){
            for(int j = 1; j <= y;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                //
                else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    // increment by one and select dp[i-1][j] for deletion
                    // dp[i][j-1] for insertion
                    // dp [i-1][j-1] for updating
                }
            }
        }
        return dp[x][y];
    }
}