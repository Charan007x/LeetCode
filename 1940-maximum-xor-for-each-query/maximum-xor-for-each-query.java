class Solution {
    public int[] getMaximumXor(int[] a, int bit) {
        int n=a.length;
        int k=1;
        int t=bit;
        while(t-->0){
            k*=2;
        }
        k--;
        for(int i=1;i<n;i++){
            a[i]=a[i]^a[i-1];
        }
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=a[n-1-i]^k;
        }
        return b;
    }
}