class Solution {
    public long subArrayRanges(int[] a) {
        int n=a.length;
        long ans=0;
        for(int i=0;i<n;i++){
            long max=Long.MIN_VALUE;
            long min=Long.MAX_VALUE;
            for(int j=i;j<n;j++){
                min=Math.min(min,a[j]);
                max=Math.max(max,a[j]);
                ans+=(max-min);
            }
        }
        return ans;
    }
}