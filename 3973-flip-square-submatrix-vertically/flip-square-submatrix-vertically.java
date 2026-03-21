class Solution {
    public int[][] reverseSubmatrix(int[][] a, int x, int y, int k) {
        int m=a.length,n=a[0].length;
        if(m-x==0||n-y==0) return a;
        for(int j=y;j<y+k;j++){
            int l=x,h=x+k-1;
            while(l<h){
                int t=a[l][j];
                a[l][j]=a[h][j];
                a[h][j]=t;
                l++;h--;
            }
        }
        return a;
    }
}