class Solution {
    public boolean isBipartite(int[][] a) {
        int n=a.length;
        int vis[]=new int[n];
        Arrays.fill(vis,-1);
        boolean ans=true;
        for(int i=0;i<n;i++){
            boolean temp=true;
            if(vis[i]==-1)temp=bfs(vis,i,a);
            ans=ans&&temp;
        }
        return ans;
    }
    public static boolean bfs(int vis[],int node,int a[][]){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        vis[node]=0;
        while(q.size()>0){
            int temp=q.poll();
            for(int i=0;i<a[temp].length;i++){
                int x=a[temp][i];
                if(vis[x]==-1){
                    vis[x]=(vis[temp]==1?0:1);
                    q.add(a[temp][i]);
                }else if(vis[x]!=-1){
                    if(vis[temp]==vis[x]) return false;
                }
            }
        }
        return true;
    }
}