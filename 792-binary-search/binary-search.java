class Solution {
    public int search(int[] a, int tar) {
        int n=a.length;
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==tar) return m;
            else if(a[m]<tar) l=m+1;
            else h=m-1;
        }
        return -1;
    }
}