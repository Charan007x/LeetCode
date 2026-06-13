class Solution {
    public int[] minCost(int[] a, int[][] q) {
    int n=a.length;
        int clo[]=new int[n];
        clo[0]=1;clo[n-1]=n-2;
        for(int i=1;i<n-1;i++){
            int x=Math.min(Math.abs(a[i]-a[i-1]),Math.abs(a[i]-a[i+1]));
            clo[i]=(x==Math.abs(a[i]-a[i-1])?i-1:i+1);
        }
    int pre[]=new int[n];
    int suf[]=new int[n+1];
    for(int i=0;i<n-1;i++){
        pre[i+1]=pre[i]+(clo[i]==i+1?1:Math.abs(a[i]-a[i+1]));
    }
    for(int i=n-1;i>0;i--){
        suf[i]=suf[i+1]+(clo[i]==i-1?1:Math.abs(a[i]-a[i-1]));
    }
    int m=q.length;
    int ans[]=new int[m];
    for(int i=0;i<m;i++){
        int x=q[i][0],y=q[i][1];
        if(x<=y){
            ans[i]=pre[y]-pre[x];
        }else ans[i]=suf[y+1]-suf[x+1];
    }
    return ans;       
    }
}