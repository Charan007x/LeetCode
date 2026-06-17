class Solution {
    public int rob(int[] a) {
        int n=a.length;
        if(n==1) return a[0];
        if(n==2) return Math.max(a[0],a[1]);
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int x=fun(a,0,n-2,dp);
        Arrays.fill(dp,-1);
        int y=fun(a,1,n-1,dp);
        return Math.max(x,y);
    }
    public static int fun(int a[],int st,int n,int dp[]){
        if(n<st) return 0;
        if(dp[n]!=-1) return dp[n];
        int left=a[n]+fun(a,st,n-2,dp);
        int right=fun(a,st,n-1,dp);
        return dp[n]=Math.max(left,right);
    }
}