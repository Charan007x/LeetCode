class Solution {
    public long minOperations(int[] a) {
        int n=a.length;
        long count=0;
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                count+=((long)a[i-1]-a[i]);
            }
        }
        return count;
    }
}