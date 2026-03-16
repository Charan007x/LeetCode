class Solution {
    public int maxProfit(int[] a) {
        int n=a.length;
        int dp[][]=new int[n+1][2];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return fun(a,0,0,dp);
    }
    public static int fun(int a[],int n,int t,int dp[][]){
        if(n==a.length) return 0;
        if(dp[n][t]!=-1) return dp[n][t];
        int ans=0,left=0;
        if(t==0) left=(-1*a[n])+fun(a,n+1,1,dp);
        if(t==1) left=(a[n])+fun(a,n+1,0,dp);
        int right=0+fun(a,n+1,t,dp);
        ans=Math.max(ans,Math.max(left,right));
        return dp[n][t]=ans; 
    }
}