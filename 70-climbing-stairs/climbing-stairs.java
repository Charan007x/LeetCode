class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return fun(n,dp);
    }
    public static int fun(int n,int dp[]){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        int left=fun(n-1,dp);
        int right=fun(n-2,dp);
        return dp[n]=left+right;
    }
}