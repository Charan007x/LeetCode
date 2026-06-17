class Solution {
    public int minCostClimbingStairs(int[] a) {
        return Math.min(fun(a,0),fun(a,1));
    }
    public static int fun(int a[],int st){
        int n=a.length;
        int dp[]=new int[n+2];
        dp[n]=0;dp[n+1]=0;
        for(int i=n-1;i>=st;i--){
            dp[i]=a[i]+Math.min(dp[i+1],dp[i+2]);
        }
        return dp[st];
    }
}