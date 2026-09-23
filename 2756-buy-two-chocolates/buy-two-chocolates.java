class Solution {
    public int buyChoco(int[] a, int k) {
        int n=a.length;
        Arrays.sort(a);
        int sum=a[0]+a[1];
        if(sum>k) return k;
        return k-sum;
    }
}