class Solution {
    public int maxOperations(int[] a) {
        int n=a.length;
        int dp[][]=new int[n][n];
        fil(dp);
        int ans1=fun(a,2,n-1,a[0]+a[1],dp);
        fil(dp);
        int ans2=fun(a,0,n-3,a[n-1]+a[n-2],dp);
        fil(dp);
        int ans3=fun(a,1,n-2,a[0]+a[n-1],dp);
        return Math.max(ans1,Math.max(ans2,ans3))+1;
    }
    public static int fun(int a[],int l,int h,int tar,int dp[][]){
        if(h<0||l>=a.length||l>=h) return 0;
        int x=0,y=0,z=0;
        if(dp[l][h]!=-1) return dp[l][h];
        if(l+1<a.length&&a[l]+a[l+1]==tar) x=1+fun(a,l+2,h,tar,dp);
        if(h-1>=0&&a[h]+a[h-1]==tar) y=1+fun(a,l,h-2,tar,dp);
        if(a[l]+a[h]==tar) z=1+fun(a,l+1,h-1,tar,dp);
        return dp[l][h]=Math.max(x,Math.max(y,z));
    }
    public static void fil(int dp[][]){
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
    }
}