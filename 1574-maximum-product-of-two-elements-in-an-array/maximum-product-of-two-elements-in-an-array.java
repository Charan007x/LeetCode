class Solution {
    public int maxProduct(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        return (a[n-1]-1)*(a[n-2]-1);
    }
}