class Solution {
    public int minCostClimbingStairs(int[] a) {
        int n=a.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int x=fun(a,0,dp);
        Arrays.fill(dp,-1);
        int y=fun(a,1,dp);
        return Math.min(x,y);
    }
    public static int fun(int a[],int n,int dp[]){
        if(n>=a.length) return 0;
        if(dp[n]!=-1) return dp[n];
        int left=a[n]+fun(a,n+1,dp);
        int right=a[n]+fun(a,n+2,dp);
        return dp[n]=Math.min(left,right);
    }
}