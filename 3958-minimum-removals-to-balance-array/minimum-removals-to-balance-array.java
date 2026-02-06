class Solution {
    public int minRemoval(int[] a, int k) {
        int n=a.length;
        Arrays.sort(a);
        int l=0,h=0;
        int max=0;
        while(h<n){
            while((long)((long)k*a[l])<(long)a[h]){
                l++;
            }
        max=Math.max(max,h-l+1);
        h++;
        }
        return n-max;
    }
}