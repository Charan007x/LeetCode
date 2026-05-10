class Solution {
    public int maximumJumps(int[] a, int tar) {
        int n=a.length;
        if(n==1) return 0;
        int dp[][]=new int[n-1][n];
        for(int i=0;i<n-1;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=fun(a,tar,n-2,n-1,dp);
        return (ans<=0?-1:ans);
    }
    public static int fun(int a[],int tar,int n,int prev,int dp[][]){
        if(prev==0) return 0;
        if(n<0) return Integer.MIN_VALUE;
        if(dp[n][prev]!=-1) return dp[n][prev];
        int left=Integer.MIN_VALUE,right=Integer.MIN_VALUE;
        if(Math.abs(a[prev]-a[n])<=tar) {
            int temp=fun(a,tar,n-1,n,dp);
            if(temp!=Integer.MIN_VALUE) left=1+temp;
        }
        right=fun(a,tar,n-1,prev,dp);
        return dp[n][prev]=Math.max(left,right);
    }
}