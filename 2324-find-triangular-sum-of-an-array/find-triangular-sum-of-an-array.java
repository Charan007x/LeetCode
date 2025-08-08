class Solution {
    public int triangularSum(int[] a) {
        int n = a.length;
        for(int j=1;j<=n-1;j++){
        for(int i=0;i<n-1;i++){
            a[i]=(a[i]+a[i+1])%10;
        }
        }
        return a[0];
    }
}