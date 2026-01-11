class Solution {
    public boolean searchMatrix(int[][] a, int tar) {
        int m=a.length,n=a[0].length;
        int rl=0,rh=m-1;
        while(rl<=rh){
            int rm=rl+(rh-rl)/2;
            if(a[rm][0]<=tar&&a[rm][n-1]>=tar){
                int l=0,h=n-1;
                while(l<=h){
                    int mid=l+(h-l)/2;
                    if(a[rm][mid]==tar) return true;
                    else if(a[rm][mid]>tar) h=mid-1;
                    else l=mid+1;
                }
                return false;
            }
            else if(a[rm][0]>tar) rh=rm-1;
            else if(a[rm][n-1]<tar) rl=rm+1;
            else return false;
        } 
        return false;       
    }
}