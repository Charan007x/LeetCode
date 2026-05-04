class Solution {
    public void rotate(int[][] a) {
       int n = a.length;
       int x = 1;
       for(int i=0;i<n;i++){ // transpose 
        for(int j=x;j<n;j++){
            int t=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=t;
        }
        x++;
       }
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
            int t=a[i][j];
            a[i][j]=a[i][n-1-j];
            a[i][n-1-j]=t;
        }
    }
    }
}