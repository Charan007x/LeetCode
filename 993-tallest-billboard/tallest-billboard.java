class Solution {
    public int tallestBillboard(int[] a) {
        int n=a.length;
        int dp[][]=new int[n][10001];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        int ans=fun(a,n-1,0,dp);
        return (ans<=0?0:ans);
    }
    public static int fun(int a[],int n,int diff,int dp[][]){
        if(n<0){
            if(diff==0) return 0;
            return Integer.MIN_VALUE;
        }
        if(dp[n][diff+5000]!=-1) return dp[n][diff+5000];
        int left=a[n]+fun(a,n-1,diff+a[n],dp);
        int right=fun(a,n-1,diff-a[n],dp);
        int oth=fun(a,n-1,diff,dp);
        return dp[n][diff+5000]=Math.max(left,Math.max(right,oth));
    }
}