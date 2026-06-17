class Solution {
    public int rob(int[] a) {
        int n=a.length;
        if(n==1) return a[0];
        if(n==2) return Math.max(a[0],a[1]);
        return Math.max(fun(a,0,n-2),fun(a,1,n-1));
    }
    public static int fun(int a[],int st,int ed){
        int n=a.length;
        int dp[]=new int[n];
        dp[st]=a[st];
        dp[st+1]=Math.max(a[st],a[st+1]);
        for(int i=st+2;i<=ed;i++){
            dp[i]=Math.max(a[i]+dp[i-2],dp[i-1]);
        }
        return dp[ed];
    }
}