class Solution {
    public int smallestDivisor(int[] a, int k) {
        int n=a.length;
        int l=1,h=0,ans=0;
        for(int i=0;i<n;i++) h=Math.max(h,a[i]);
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
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%m==0) sum+=a[i]/m;
            else sum+=(a[i]/m)+1;
        }
        return (sum<=k?true:false);
    }
}