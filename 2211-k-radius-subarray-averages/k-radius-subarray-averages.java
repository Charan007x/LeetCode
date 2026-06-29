class Solution {
    public int[] getAverages(int[] a, int k) {
        int n=a.length;
        int ans[]=new int[n];
        long pre[]=new long[n+1];
        for(int i=1;i<=n;i++) pre[i]=pre[i-1]+a[i-1];
        for(int i=0;i<n;i++){
            if(i-k<0||i+k>=n) ans[i]=-1;
            else{
                ans[i]=(int)((pre[i+k+1]-pre[i-k])/(long)(2*k+1));
            }
        }
        return ans;
    }
}