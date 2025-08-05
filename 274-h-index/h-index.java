class Solution {
    public int hIndex(int[] a) {
        int n = a.length;
        int x=0,max=0;
        //if(n==1&&a[0]==0) return 0;
        for(int i=1;i<=n;i++){
            x=0;
            for(int j=0;j<n;j++){
                if(i<=a[j]) x++;
            }
                if(i<=x) max=Math.max(i,max);
        }
        return max;
    }
}