class Solution {
    public boolean areSimilar(int[][] a, int k) {
        int m=a.length,n=a[0].length;
        k%=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[j][i]!=a[j][(i+k)%n]) return false;
            }
        }
        return true;
    }
}