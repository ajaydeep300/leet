class Solution {
    public int minSteps(int n) {
       // int[] dp = new int[n+1];
        int ret = 0;
        //dp[0] = 1;// copy
        //dp[1] = 2;// dp[0] + 1 for pasting
//Eg: n=6
//To get 6, we need to copy 3 'A's two time. (2)
//To get 3 'A's, copy the 1 'A' three times. (3)
//So the answer for 6 is 5

//Now, take n=9.
//We need the lowest number just before 9 such that (9% number =0). So the lowest number is 3.
//So 9%3=0. We need to copy 3 'A's three times to get 9. (3)
//For getting 3 'A's, we need to copy 1 'A' three times. (3)
//so the answer is 6


        for(int i = 2;i <= n; i ++){
            while(n%i == 0){
                ret += i;
                n = n/i;
            }
        }
        return ret;
    }
}