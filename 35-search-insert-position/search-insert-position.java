class Solution {
    public int searchInsert(int[] a, int tar) {
        int n=a.length;
        int l=0,h=n-1,ans=n;{
            while(l<=h){
                int m=l+(h-l)/2;
                if(a[m]>=tar){
                    ans=m;
                    h=m-1;
                }else l=m+1;
            }
        }
        return ans;
    }
}