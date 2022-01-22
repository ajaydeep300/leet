class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int out = Integer.MAX_VALUE;
        int len = matrix.length;
        int[][] dp = new int[len][len];
        for(int i = 0; i < len;i++)
            dp[0][i] = matrix[0][i];//intialize
        
        for(int i = 1;i < len;i++){// fill table
            for(int j = 0;j < len;j++){
                if(j == 0)
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],dp[i-1][j+1]);
                else if(j == len - 1)
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j-1],dp[i-1][j]);
                else
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i-1][j+1]));
            }   
        }
        for(int i = 0; i < len;i++)
            out = Math.min(out,dp[len-1][i]);
        
        return out;
    }
}