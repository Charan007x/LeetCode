class Solution {
    public boolean canReach(int[] a, int[] b) {
        return (a[0]+a[1])%2==(b[0]+b[1])%2;
    }
}