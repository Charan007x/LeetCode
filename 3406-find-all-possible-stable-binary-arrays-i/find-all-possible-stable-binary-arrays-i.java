class Solution {
    public int numberOfStableArrays(int zero, int one, int limit) {
        long mod=1000000007;
        long dp[][][][]=new long[zero+1][one+1][3][Math.max(zero,one)+1];
        for(long[][][] arr3 : dp)
        for(long[][] arr2 : arr3)
        for(long[] arr1 : arr2)Arrays.fill(arr1, -1);
        long ans=fun(zero,one,2,0,limit,dp,mod);
        ans=(ans%mod);
        return (int)(ans);
    }
    public static long fun(int x,int y,int t,int c,int l,long dp[][][][],long mod){
        if(c==l+1) return 0;
        if(x==0&&y==0) return 1;
        if(dp[x][y][t][c]!=-1) return dp[x][y][t][c];
        long left=0,right=0;
        if(x>0) left=fun(x-1,y,0,(t==0?c+1:1),l,dp,mod)%mod;
        if(y>0) right=fun(x,y-1,1,(t==1?c+1:1),l,dp,mod)%mod;
        return dp[x][y][t][c]=((long)(left)+(long)(right))%mod;
    }
}