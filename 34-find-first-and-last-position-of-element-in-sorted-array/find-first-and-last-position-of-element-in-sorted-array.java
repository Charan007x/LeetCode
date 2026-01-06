class Solution {
    public int[] searchRange(int[] a, int tar) {
        int n=a.length;
        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]>=tar){
                if(a[m]==tar) ans[0]=m;
                h=m-1;
            }else l=m+1;
        }
        l=0;h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]<=tar){
                if(a[m]==tar) ans[1]=m;
                l=m+1;
            }else h=m-1;
        }
        return ans;
    }
}