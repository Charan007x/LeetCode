class Solution {
    public int[] countTasks(int[] a, int[] b) {
        int n=a.length;
        long pre[]=new long[n+1];
       for(int i=1;i<=n;i++) pre[i]=pre[i-1]+(long)a[i-1];
        int ans[]=new int[b.length];
        int l=1,h=n,c=0;
        long incomp=0;
        for(int i=0;i<b.length;i++){
            int idx=fun(pre,b[i],l,h,c,incomp);
            if(idx==-1){
                incomp+=b[i];
                ans[i]=n-l+1;
            }else{
                long spent = pre[idx] - pre[c] - incomp;
                incomp =b[i]-spent;
                if(idx==n){
                    c=0;
                    l=1;
                    ans[i]=0;
                    incomp=0;
                }else{
                    c=idx;
                    l=idx+1;
                    ans[i]=n-idx;
                    // if(b[i]-pre[idx]>=0) incomp=b[i]-pre[idx];
                }
            }
        }
        return ans;
    }
    public static int fun(long a[],int tar,int l,int h,int c,long incomp){
        int ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]-a[c]-incomp<=tar){
                ans=m;
                l=m+1;
            }else h=m-1;
        }
         return ans;
    }
}