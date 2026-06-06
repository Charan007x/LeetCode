class Solution {
    public int[] leftRightDifference(int[] a) {
        int n=a.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        for(int i=1;i<n;i++) pre[i]=pre[i-1]+a[i-1];
        for(int i=n-2;i>=0;i--) suf[i]=suf[i+1]+a[i+1];
        int ans[]=new int[n];
        for(int i=0;i<n;i++) ans[i]=Math.abs(pre[i]-suf[i]);
        return ans;
    }
}