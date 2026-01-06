class Solution {
    public int search(int[] a, int tar) {
        int n=a.length;
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==tar) return m;
            if(a[l]<=a[m]){
                if(a[l]<=tar&&tar<a[m]) h=m-1;
                else l=m+1;
            }else{
                if(a[h]>=tar&&tar>a[m]) l=m+1;
                else h=m-1;
            }
        }
        return -1;
    }
}