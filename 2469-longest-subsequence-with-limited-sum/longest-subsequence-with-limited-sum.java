class Solution {
    public int[] answerQueries(int[] a, int[] q) {
        int m=a.length,n=q.length;
        Arrays.sort(a);
        int ans[]=new int[n];
        for(int i=0;i<n;i++){ // queries traversal
            int sum=0;
            for(int j=0;j<m;j++){ // array traversal
                sum+=a[j];
                if(sum<=q[i]) ans[i]=j+1;
                else break;
            }
        }
        return ans;
    }
}