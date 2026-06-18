class Solution {
    public int bestTeamScore(int[] b, int[] a) {
        int n=a.length;
        Integer[] idx=new Integer[n];
        for(int i=0;i<n;i++) idx[i]=i;
        Arrays.sort(idx,(i,j)->{
            if(a[i]==a[j]) return Integer.compare(b[i],b[j]);
            return Integer.compare(a[i],a[j]);
        });
        int c[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++) c[i]=a[idx[i]];
        for(int i=0;i<n;i++) d[i]=b[idx[i]];
        int dp[][]=new int[n][n+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return fun(c,d,n-1,n,dp);
    }
    public static int fun(int a[],int b[],int n,int prev,int dp[][]){
        if(n<0){
            return 0;
        }
        if(dp[n][prev]!=-1) return dp[n][prev];
        int left=-50000,right=-50000;
        if(prev==a.length)left=b[n]+fun(a,b,n-1,n,dp);
        else{
           if(b[n]<=b[prev]) left=b[n]+fun(a,b,n-1,n,dp);
        }
        right=fun(a,b,n-1,prev,dp);
        return dp[n][prev]=Math.max(left,right);
    }
}