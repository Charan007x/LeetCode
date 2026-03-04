class Solution {
    public int numSpecial(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
        if(a[i][j]==1){
            if(row[i]==1&&col[j]==1) ans++;
        }
            }
        }
        return ans;
    }
}