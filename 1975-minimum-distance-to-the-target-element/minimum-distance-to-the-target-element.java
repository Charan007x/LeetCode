class Solution {
    public int getMinDistance(int[] a, int tar, int k) {
        int n=a.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]==tar){
                ans=Math.min(ans,Math.abs(i-k));
            }
        }
        return ans;
    }
}