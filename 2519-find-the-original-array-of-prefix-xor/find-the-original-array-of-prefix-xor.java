class Solution {
    public int[] findArray(int[] pre) {
        int n=pre.length;
        int ans[]=new int[n];
        ans[0]=pre[0];
        for(int i=1;i<n;i++){
            ans[i]=pre[i]^pre[i-1];
        }
        return ans;
    }
}