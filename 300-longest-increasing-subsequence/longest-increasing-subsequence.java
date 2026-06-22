class Solution {
    public int lengthOfLIS(int[] a) {
        int n=a.length;
        int dp[][]=new int[n+2][n];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return fun(a,-1,0,dp);
    }
    public static int fun(int a[],int prev,int curr,int dp[][]){
        if(curr>=a.length){
            return 0;
        }
        if(dp[prev+2][curr]!=-1) return dp[prev+2][curr];
        int left=0,right=0;
        if(prev==-1) left=1+fun(a,curr,curr+1,dp);
        else if(a[prev]<a[curr]) left=1+fun(a,curr,curr+1,dp);
        right=fun(a,prev,curr+1,dp);
        return dp[prev+2][curr]=Math.max(left,right);
    }
}