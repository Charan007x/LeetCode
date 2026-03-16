class Solution {
    public int longestCommonSubsequence(String s, String t) {
        int m=s.length(),n=t.length();
        int dp[][]=new int[m][n];
        for(int x[]:dp) Arrays.fill(x,-1);
        return fun(s,t,m-1,n-1,dp);
    }
    public static int fun(String s,String t,int i,int j,int dp[][]){
        if(i<0||j<0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int left=0,right=0;
        if(s.charAt(i)==t.charAt(j)) left=1+fun(s,t,i-1,j-1,dp);
        else{
            right=Math.max(fun(s,t,i-1,j,dp),fun(s,t,i,j-1,dp));
        }
        return dp[i][j]=Math.max(left,right);
    }
}