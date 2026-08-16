class Solution {
    public int longestSubsequence(int[] a) {
        int n=a.length;
        int xor=0,count=0;
        for(int i=0;i<n;i++){
            xor^=a[i];
            if(a[i]==0) count++;
        }
        if(count==n) return 0;
        if(xor==0) return n-1;
        return n;
    }
}