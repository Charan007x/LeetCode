class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        a[0]=1;
        for(int i=1;i<n;i++){
            if(a[i]-a[i-1]>1){
                a[i]=a[i-1]+1;
            }
        }
        return a[n-1];
    }
}