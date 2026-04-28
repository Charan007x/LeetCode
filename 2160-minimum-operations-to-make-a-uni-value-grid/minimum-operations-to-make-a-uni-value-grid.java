class Solution {
    public int minOperations(int[][] a, int x) {
        int m=a.length,n=a[0].length;
        int y=0,ans=0;
        int b[]=new int[m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[y++]=a[i][j];
            }
        }
        n=m*n;
        Arrays.sort(b);
        int k=(0+n-1)/2;
        for(int i=0;i<n;i++){
            if(Math.abs(b[i]-b[k])%x==0){
                ans+=(Math.abs(b[i]-b[k])/x);
            }else return -1;
        }
        return ans;
    }
}