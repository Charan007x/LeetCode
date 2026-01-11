class Solution {
    public boolean searchMatrix(int[][] a, int tar) {
        int mi=a.length,n=a[0].length;
        for(int i=0;i<mi;i++){
            int l=0,h=n-1;
            while(l<=h){
                int m=l+(h-l)/2;
                if(a[i][m]==tar) return true;
                else if(a[i][m]<tar) l=m+1;
                else h=m-1;
            }
        }
        return false;
    }
}