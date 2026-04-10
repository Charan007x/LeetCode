class Solution {
    public int minimumDistance(int[] a) {
        int n=a.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=1;j<n-1;j++){
                for(int k=2;k<n;k++){
                    if(i!=j&&j!=k&&k!=i&&a[i]==a[j]&&a[j]==a[k]){
                        ans=Math.min(ans,Math.abs(i-j)+Math.abs(j-k) + Math.abs(k-i));
                    }
                }
            }
        }
        return (ans!=Integer.MAX_VALUE?ans:-1);
    }
}