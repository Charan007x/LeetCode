class Solution {
    public int equalPairs(int[][] a) {
        int n=a.length;
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=a[j][i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(Arrays.equals(a[i],b[j])) count++;
            }
        }
        return count;
    }
}