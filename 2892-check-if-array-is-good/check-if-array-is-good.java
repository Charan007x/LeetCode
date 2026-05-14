class Solution {
    public boolean isGood(int[] a) {
        int n=a.length;
        if(n==1) return false;
        Arrays.sort(a);
        if(a[n-2]!=a[n-1]) return false;
        if(a[n-1]!=n-1) return false;
        int x=n-1;
        for(int i=n-2;i>=0;i--){
            if(a[i]!=x) return false;
            x--;
        }
        return true;
    }
}