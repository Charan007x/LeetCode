class Solution {
    public int maxProfit(int[] a) {
        int n=a.length;
        int min=Integer.MAX_VALUE;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,a[i]);
            ans=Math.max(ans,a[i]-min);
        }
        return (ans==Integer.MIN_VALUE?0:ans);
    }
}