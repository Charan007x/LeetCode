class Solution {
    public int minCut(String s) {
        int n=s.length();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return fun(s,0,dp)-1;
    }
    public static int fun(String s,int n,int dp[]){
        if(n==s.length()) return 0;
        if(dp[n]!=-1) return dp[n];
        int ans=Integer.MAX_VALUE;
        for(int i=n+1;i<=s.length();i++){
            if(pal(s.substring(n,i))){
                int left=1+fun(s,i,dp);
                ans=Math.min(ans,left);
            }
        }
        return dp[n]=ans;
    }
    public static boolean pal(String s){
        int n=s.length();
        int l=0,h=n-1;
        while(l<h){
            if(s.charAt(l)!=s.charAt(h)) return false;
            l++;h--;
        }
        return true;
    }
}