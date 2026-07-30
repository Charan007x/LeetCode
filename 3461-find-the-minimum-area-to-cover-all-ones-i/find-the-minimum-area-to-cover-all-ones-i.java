class Solution {
    public int minimumArea(int[][] a) {
        int m=a.length,n=a[0].length;
        int l=-1,r=-1,t=-1,b=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    if(l==-1){
                        l=j;r=j;
                        t=i;b=i;
                    }else{
                        if(j<l) l=j;
                        if(j>r) r=j;
                        if(i<t) t=i;
                        if(i>b) b=i;
                    }
                }
            }
        }
        int len=r-l+1,bre=b-t+1;
        return len*bre;
    }
}