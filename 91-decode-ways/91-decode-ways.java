class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0 || s == null)
            return 0;
        int[] dp = new int[s.length() + 1];
        // create a dp array
        dp[0] = 1;
        // intialize with 1 since if there is one one charater in string then we return 1
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        // intialize with 1, if the second character is not 0 then our length becomes 1 for this char
        for(int i = 2; i < dp.length;i++){
            int one = Integer.valueOf(s.substring(i-1,i));
            int two = Integer.valueOf(s.substring(i-2,i));
            if(one >= 1 && one <= 9)
                dp[i] += dp[i-1];
            if(two >= 10 && two <= 26)
                dp[i] += dp[i-2];
        }
        // run a loop and increment dp starting from dp 0 and 1; for different values like 1 and 10 
        return dp[s.length()];
    }
}