class Solution {
    public int minPairSum(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        int l=0,h=n-1;
        int sum=0;
        while(l<h){
            sum=Math.max(a[l]+a[h],sum);
            l++;h--;
        }
        return sum;
    }
}