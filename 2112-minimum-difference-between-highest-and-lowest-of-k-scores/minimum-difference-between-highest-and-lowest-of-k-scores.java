class Solution {
    public int minimumDifference(int[] a, int k) {
        int n=a.length;
        if(k==1||n==1) return 0;
        Arrays.sort(a);
        int ans=Integer.MAX_VALUE;
        int i=0;
        while(n-k-i>=0){
            int  x=a[n-1-i]-a[n-k-i];
           ans= Math.min(ans,x);
            i++;
        }
        return ans;
    }
}