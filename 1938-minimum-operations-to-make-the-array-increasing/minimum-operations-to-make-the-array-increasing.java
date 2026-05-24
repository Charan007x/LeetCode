class Solution {
    public int minOperations(int[] a) {
        int n=a.length,count=0;
        if(n==1) return 0;
        for(int i=1;i<n;i++){
            if(a[i-1]>=a[i]){
                int x=a[i-1]-a[i]+1;
                count+=x;
                a[i]+=x;
            }
        }
        return count;
    }
}