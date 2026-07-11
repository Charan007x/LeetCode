class Solution {
    public int maxSumDivThree(int[] a) {
        int n=a.length;
        int sum=0;
        int dp[][]=new int[n][3];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return (fun(a,n-1,sum,dp));
    }
    public static int fun(int a[],int n,int sum,int dp[][]){
        if(n<0){
            if(sum==0) return 0;
            return Integer.MIN_VALUE;
        }
        if(dp[n][sum]!=-1) return dp[n][sum];
        int left=a[n]+fun(a,n-1,(sum+a[n])%3,dp);
        int right=fun(a,n-1,sum,dp);
        return dp[n][sum]=Math.max(left,right);
    }
}