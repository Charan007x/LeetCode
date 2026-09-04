class Solution {
    public int firstStableIndex(int[] a, int k) {
        int n=a.length,ans=Integer.MAX_VALUE,idx=-1;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            for(int j=0;j<=i;j++) max=Math.max(a[j],max);
            for(int j=i;j<n;j++) min=Math.min(a[j],min);
            if(max-min<=k){
                return i;
            }
        }
        return idx;
    }
}