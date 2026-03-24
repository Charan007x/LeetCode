class Solution {
    public int[][] constructProductMatrix(int[][] a) {
        int m=a.length,n=a[0].length;
        int tot=m*n;
        long pre[]=new long[tot];
        long suf[]=new long[tot];
        int b[]=new int[tot];
        int x=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[x]=a[i][j];
                x++;
            }
        }
        pre[0]=1;suf[tot-1]=1;
        for(int i=1;i<tot;i++) pre[i]=(pre[i-1]*b[i-1])%12345;
        for(int i=tot-2;i>=0;i--) suf[i]=(suf[i+1]*b[i+1])%12345;
        long ans[]=new long[tot];
        for(int i=0;i<tot;i++){
            ans[i]=(pre[i]*suf[i])%12345;
        }
        x=0;
        int fin[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                fin[i][j]=(int)((pre[x]*suf[x])%12345);
                x++;
            }
        }
        return fin;
    }
}