class Solution {
    public int[] kWeakestRows(int[][] a, int k) {
        int m=a.length,n=a[0].length;
        int b[]=new int[m];
        Integer[]idx=new Integer[m];
        for(int i=0;i<m;i++) idx[i]=i;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(a[i][j]==1) count++;
            }
            b[i]=count;
        }
        Arrays.sort(idx,(i,j)->{
            if(b[i]!=b[j]) return b[i]-b[j];
            return i-j;
        });
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=idx[i];
        }
        return ans;
    }
}