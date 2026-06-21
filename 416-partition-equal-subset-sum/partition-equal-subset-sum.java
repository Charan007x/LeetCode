class Solution {
    public boolean canPartition(int[] a) {
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++) sum+=a[i];
        if(sum%2!=0)return false;
        int dp[][]=new int[n][(sum/2)+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        int ans= fun(a,n-1,sum/2,dp);
        return (ans==0?false:true);
    }
    public static int fun(int a[],int n,int sum,int dp[][]){
        if(sum==0) return 1;
        if(n<0||sum<0) return 0;
        if(dp[n][sum]!=-1) return dp[n][sum];
        int left=fun(a,n-1,sum-a[n],dp);
        int right=fun(a,n-1,sum,dp);
        return dp[n][sum]= left+right;
    }
}