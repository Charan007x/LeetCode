class Solution {
    public int numDistinct(String s, String t) {
        int m=s.length(),n=t.length();
        int dp[][]=new int[m][n];
        for(int x[]:dp) Arrays.fill(x,-1);
        return fun(s,t,m-1,n-1,dp);
    }
    public static int fun(String s,String t,int m,int n,int dp[][]){
        if(n<0){
            return 1;
        }
        if(m<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        int left=0,right=0;
        if(s.charAt(m)==t.charAt(n)) left=fun(s,t,m-1,n-1,dp);
        right=fun(s,t,m-1,n,dp);
        return dp[m][n]=left+right;
    }
}