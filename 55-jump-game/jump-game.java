class Solution {
    public boolean canJump(int[] a) {
        int n=a.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int ans= fun(a,0,dp);
        return (ans==0?false:true);
    }
    public static int fun(int a[],int n,int dp[]){
        if(n==a.length-1) return 1;
        if(n>=a.length) return 0;
        if(dp[n]!=-1) return dp[n];
        int left=0;
        int x=a[n];
        for(int i=1;i<=x;i++){
            if(left==1) return dp[n]=left;
            left=left+fun(a,n+i,dp);
        }
        return dp[n]=left;
    }
}