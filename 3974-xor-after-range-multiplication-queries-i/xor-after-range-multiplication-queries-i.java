class Solution {
    public int xorAfterQueries(int[] a, int[][] b) {
        int n=a.length;
        int m=b.length;
        long mod=1000000007;
        for(int i=0;i<m;i++){
            for(int j=b[i][0];j<=b[i][1];j+=b[i][2]){
                long x=((long)a[j]*(long)b[i][3])%mod;
                a[j]=(int)x;
            }
        }
        int ans=0;
        for(int z:a) ans=ans^z;
        return ans;
    }
}