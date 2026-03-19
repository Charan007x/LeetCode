class Solution {
    public int deleteGreatestValue(int[][] a) {
        int m=a.length,n=a[0].length;
        for(int i=0;i<m;i++){
            Arrays.sort(a[i]);
        }
        int ans=0;
        for(int j=0;j<n;j++){
            int max=0;
            for(int i=0;i<m;i++){
            max=Math.max(a[i][j],max);
        }
        ans+=max;
        }
        return ans;
    }
}