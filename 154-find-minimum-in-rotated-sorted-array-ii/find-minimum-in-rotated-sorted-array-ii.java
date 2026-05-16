class Solution {
    public int findMin(int[] a) {
        int ans=10000;
        int n=a.length;
        for(int i=0;i<n;i++) ans=Math.min(ans,a[i]);
        return ans;
    }
}