class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len=strs.length;
        int b[]=new int[len];
        for(int i=0;i<len;i++){
            String s=strs[i];
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1') count++;
            }
            b[i]=count;
        }
        int dp[][][]=new int[m+1+100][n+1+100][len];
        for(int i[][]:dp){
            for(int j[]:i){
                Arrays.fill(j,-1);
            }
        }
        int ans=fun(strs,b,m,n,len-1,dp);
        return (ans<=0?0:ans);
    }
    public static int fun(String []s,int b[],int m,int n,int idx,int dp[][][]){
        if(idx<0){
            if(m>=0&&n>=0)return 0;
            return -50000;
        }
        if(m<0||n<0) return -50000;
        if(dp[m+100][n+100][idx]!=-1) return dp[m+100][n+100][idx];
        int left=1+fun(s,b,m-(s[idx].length()-b[idx]),n-b[idx],idx-1,dp);
        int right=fun(s,b,m,n,idx-1,dp);
        return dp[m+100][n+100][idx]=Math.max(left,right);
    }
}