class Solution {
    public int minTimeToVisitAllPoints(int[][] a) {
        int n=a.length,ans=0;
        if(n==1) return 0;
        for(int i=1;i<n;i++){
            int x=Math.abs(a[i][0]-a[i-1][0]);
            int y=Math.abs(a[i][1]-a[i-1][1]);
            int same=Math.min(x,y);
            ans+=same;
            ans+=Math.abs(same-Math.max(x,y));
        }
        return ans;
    }
}