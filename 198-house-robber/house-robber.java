class Solution {
    public int rob(int[] a) {
        int n=a.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
       return fun(a,n-1,dp); 
    }
    public static int fun(int a[],int n,int dp[]){
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int left=a[n]+fun(a,n-2,dp);
        int right=fun(a,n-1,dp);
        return dp[n]=Math.max(left,right);
    }
}