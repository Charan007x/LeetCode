class Solution {
    public int[] maxSlidingWindow(int[] a, int x) {
        int n=a.length;
        int K=(int)(Math.log(n)/Math.log(2))+1;
        int st[][]=new int[K][n];
        for(int i=0;i<n;i++) st[0][i]=a[i];
        for(int k=1;k<K;k++){
            int sz=(int)(Math.pow(2,k));
            for(int i=0;i+sz<=n;i++){
    st[k][i]=Math.max(st[k-1][i],st[k-1][i+(sz/2)]);
            }
        }
        int ans[]=new int[n-x+1];
        int m=ans.length,h=x-1;
        int y=(int)(Math.log(x)/Math.log(2));
        for(int i=0;i<m;i++){
            ans[i]=Math.max(st[y][i],st[y][h+1-(int)(Math.pow(2,y))]);
            h++;
        }
        return ans;
    }
}