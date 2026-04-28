class Solution {
    public int minMoves2(int[] b) {
        int n=b.length,ans=0,x=1;
        Arrays.sort(b);
        int k=(0+n-1)/2;
        for(int i=0;i<n;i++){
            if(Math.abs(b[i]-b[k])%x==0){
                ans+=(Math.abs(b[i]-b[k])/x);
            }else return -1;
        }
        return ans;
    }
}