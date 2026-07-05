class Solution {
    public int[] pathsWithMaxScore(List<String> list) {
        int n=list.size();    
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0&&j==0)||(i==n-1&&j==n-1)) a[i][j]=0;
                else{
                char ch=list.get(i).charAt(j);
                if(ch=='X') a[i][j]=-1;
                else{
                    a[i][j]=ch-'0';
                }
                }
            }
        }
        int dp[][]=new int[n][n];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        int ans=fun(a,n-1,n-1,dp);
        if(ans<0) return new int[]{0,0};
        long dp1[][][]=new long[n][n][ans+1];
        for(long i[][]:dp1){
            for(long j[]:i){
                Arrays.fill(j,-1);
            }
        }
        long ans2=func(a,n-1,n-1,ans,dp1);
        return new int[]{ans,(int)(ans2%1000000007)};
    }
    public static int fun(int a[][],int m,int n,int dp[][]){
        if(m==0&&n==0) return 0;
        if(m<0||n<0) return -500;
        if(a[m][n]==-1) return -500;
        if(dp[m][n]!=-1) return dp[m][n];
        int left=fun(a,m-1,n,dp);
        int right=fun(a,m,n-1,dp);
        int oth=fun(a,m-1,n-1,dp);
        return dp[m][n]=a[m][n]+Math.max(left,Math.max(right,oth));
    }
    public static long func(int a[][],int m,int n,int tar,long dp1[][][]){
        if(m==0&&n==0){
            if(tar==0) return 1;
            return 0;
        }
        if(tar<0) return 0;
        if(m<0||n<0) return 0;
        if(a[m][n]==-1) return 0;
        if(dp1[m][n][tar]!=-1) return dp1[m][n][tar];
        long left=func(a,m-1,n,tar-a[m][n],dp1);
        long right=func(a,m,n-1,tar-a[m][n],dp1);
        long oth=func(a,m-1,n-1,tar-a[m][n],dp1);
        return dp1[m][n][tar]=(left+right+oth)%1000000007;
    }
}