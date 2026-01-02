class Solution {
    public int minSubArrayLen(int k, int[] a) {
        int n=a.length;
        int ans=Integer.MAX_VALUE,sum=0;
        int l=0,h=0;
        while(h<n){
            sum+=a[h];
            while(sum>=k){
                sum-=a[l];
                ans=Math.min(ans,h-l+1);
                l++;
            }
            h++;
        }
        return (ans==Integer.MAX_VALUE?0:ans);
    }
}