class Solution {
    public int maxDistance(int[] a) {
        int n=a.length;
        int max=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]!=a[j]) max=Math.max(max,j-i);
            }
        }
        return max;
    }
}