class Solution {
    public int minCost(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        if(n==1) return 0;
        return fun(n,dp)+1;
    }
    public static int fun(int n,int dp[]){
        if(n==1) return 0;
        if(dp[n]!=-1) return dp[n];
        int left=0,right=0;
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(n-i>1){
                int temp=fun(n-i,dp);
                if(temp!=Integer.MAX_VALUE) left=((n-i)*i)+temp;
            }
            if(i>1){
                int temp=fun(i,dp);
                if(temp!=Integer.MAX_VALUE) right=((n-i)*i)+temp;
            }
            ans=Math.min(ans,left+right);
        }
        return dp[n]=ans;
    }
}