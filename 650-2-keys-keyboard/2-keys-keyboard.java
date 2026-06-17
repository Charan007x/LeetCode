class Solution {
    public int minSteps(int n) {
        int dp[][][]=new int[n+1][n+1][2];
        for(int i[][]:dp){
            for(int j[]:i){
                Arrays.fill(j,-1);
            }
        }
        return fun(n,1,0,0,dp);
    }
    public static int fun(int n,int curr,int cpy,int x,int dp[][][]){
        if(n==curr) return 0;
        if(curr>n) return 500000;
        if(dp[curr][cpy][x]!=-1) return dp[curr][cpy][x];
        int left=500000;
        if(x!=1) left=1+fun(n,curr,curr,1,dp);
        int right=500000;
        if(cpy>0)right=1+fun(n,curr+cpy,cpy,0,dp);
        return dp[curr][cpy][x]= Math.min(left,right);
    }
}