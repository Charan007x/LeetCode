class Solution {
    public int largestAltitude(int[] a) {
        int n=a.length;
        int pre[]=new int[n+1];
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+a[i-1];
        }
        int max=0;
        for(int i=0;i<=n;i++){
            max=Math.max(max,pre[i]);
        }
        return max;
    }
}