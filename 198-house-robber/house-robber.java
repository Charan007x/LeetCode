class Solution {
    public int rob(int[] a) {
        int n=a.length;
        if(n==1) return a[0];
        return fun(a);
    }
    public static int fun(int a[]){
        int n=a.length;
        int dp[]=new int[n];
        dp[0]=a[0];
        dp[1]=Math.max(a[0],a[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(a[i]+dp[i-2],dp[i-1]);
        }        
        return dp[n-1];
    }
}