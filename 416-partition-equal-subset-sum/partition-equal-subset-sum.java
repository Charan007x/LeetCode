class Solution {
    public boolean canPartition(int[] a) {
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++) sum+=a[i];
        if(sum%2!=0) return false;
        int ans=fun(a,sum);
        return (ans==0?false:true);
    }
    public static int fun(int a[],int sum){
        int n=a.length;
        int dp[][]=new int[n][(sum/2)+1];
        for(int i=0;i<n;i++) dp[i][0]=1;
        if(a[0]<=sum/2) dp[0][a[0]]=1;
        for(int i=1;i<n;i++){
            int left=0,right=0;
            for(int j=1;j<=sum/2;j++){
                if(a[i]<=j) left=dp[i-1][j-a[i]];
                right=dp[i-1][j];
                dp[i][j]=left+right;
            }
        }
        return dp[n-1][(sum/2)];
    }
}