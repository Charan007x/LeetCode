class Solution {
    public boolean canBeEqual(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}