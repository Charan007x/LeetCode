class Solution {
    public int alternatingSum(int[] a) {
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0) sum+=a[i];
            else sum-=a[i];
        }
        return sum;
    }
}