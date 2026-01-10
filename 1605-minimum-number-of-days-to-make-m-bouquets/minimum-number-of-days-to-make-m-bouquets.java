class Solution {
    public int minDays(int[] a, int tar, int k) {
        int n=a.length;
        if((long)tar*(long)k>(long)n) return -1;
        int l=1,h=0,ans=0;
        for(int i=0;i<n;i++) h=Math.max(h,a[i]);
        while(l<=h){
            int m=l+(h-l)/2;
            if(fun(a,m,k,tar)){
                ans=m;
                h=m-1;
            }else l=m+1;
        }
        return ans;
    }
    public static boolean fun(int a[],int m,int k,int tar){
        int n=a.length;
        int count=0,x=0;
        for(int i=0;i<n;i++){
            if(a[i]<=m){
                x++;
            }
            if(x==k){
                 count++;
                 x=0;
            }
            if(a[i]>m) x=0;
        }
        return (count>=tar?true:false);
    }
}