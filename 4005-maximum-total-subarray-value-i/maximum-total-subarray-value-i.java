class Solution {
    public long maxTotalValue(int[] a, int k) {
        int max=Arrays.stream(a).max().getAsInt();
        int min=Arrays.stream(a).min().getAsInt();
        long ans=(long)(max-min);
        ans=(long)(k*ans);
        return ans;
    }
}