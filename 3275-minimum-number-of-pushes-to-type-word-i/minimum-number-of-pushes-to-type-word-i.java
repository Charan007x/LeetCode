class Solution {
    public int minimumPushes(String s) {
        int n=s.length();
        if(n>=1&&n<=8) return n;
        if(n>=9&&n<=16) return (8)+((n-8)*2);
        if(n>=17&&n<=24) return (8)+(16)+((n-16)*3);
        return 8+16+24+((n-24)*4);
    }
}