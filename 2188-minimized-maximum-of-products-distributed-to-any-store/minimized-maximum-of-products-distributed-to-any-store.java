class Solution {
    public int minimizedMaximum(int k, int[] a) {
        int n=a.length;
        int l=1,h=0;
        for(int i=0;i<n;i++) h=Math.max(h,a[i]);
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(fun(a,m,k)){
                h=m-1;
                ans=m;
            }else l=m+1;
        }
        return ans;
    }
    public static boolean fun(int a[],int m,int k){
        int n=a.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]%m==0) count+=(a[i]/m);
            else count+=(a[i]/m)+1;
        }
        return (count<=k?true:false);
    }
}