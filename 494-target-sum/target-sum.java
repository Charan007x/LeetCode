class Solution {
    public int findTargetSumWays(int[] a, int tar) {
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++) sum+=a[i];
        sum+=Math.abs(tar);
        int os=sum;
        int dp[][]=new int[n][sum+1+os];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return fun(a,n-1,tar,dp,os);
    }
    public static int fun(int a[],int n,int tar,int dp[][],int os){
        if(n<0){
            if(tar==0) return 1;
            return 0;
        }
        if(dp[n][tar+os]!=-1) return dp[n][tar+os];
        int left=fun(a,n-1,tar-a[n],dp,os);
        int right=fun(a,n-1,tar+a[n],dp,os);
        return dp[n][tar+os]=left+right;
    }
}