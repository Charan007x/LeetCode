class Solution {
    public int singleNonDuplicate(int[] a) {
        int n=a.length;
        int l=0,h=1;
        while(h<n){
            if(a[l]!=a[h]) return a[l];
            l=h+1;
            h=l+1;
        }
        return a[l];
    }
}