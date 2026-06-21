class Solution {
    public int stoneGameII(int[] a) {
        int n=a.length;
        int pre[]=new int[n+1];
        for(int i=1;i<=n;i++) pre[i]=a[i-1]+pre[i-1];
        int dp[][][]=new int[n][200][2];
        for(int i[][]:dp){
            for(int j[]:i)
            Arrays.fill(j,-1);
        }
        int ans=fun(a,0,pre,0,1,dp);
        return ans;
    }
    public static int fun(int a[],int n,int pre[],int t,int m,int dp[][][]){
        if(n>=a.length){
            return 0;
        }
        if(dp[n][m][t]!=-1) return dp[n][m][t];
        int left=0,right=Integer.MAX_VALUE;
        if(t==0){
            for(int i=1;i<=2*m;i++){
  if(n+i<=a.length) left=Math.max(left,((pre[n+i]-pre[n])+fun(a,n+i,pre,1,Math.max(i,m),dp)));
            }
        }else{
            for(int i=1;i<=2*m;i++){
  if(n+i<=a.length) right=Math.min(right,fun(a,n+i,pre,0,Math.max(i,m),dp));              
            }
        }
        if(t==0) return dp[n][m][t]=left;
        return dp[n][m][t]=right;
    }
}