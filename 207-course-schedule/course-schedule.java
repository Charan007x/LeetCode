class Solution {
    public boolean canFinish(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int x=edges[i][0];
            int y=edges[i][1];
            adj.get(y).add(x);
        }
        int vis[]=new int[n];
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(flag) return false;
            if(vis[i]==0){
                flag=fun(i,vis,adj);
            }
        }
        return true;
    }
    public static boolean fun(int node,int vis[],List<List<Integer>> adj){
        vis[node]=1;
        for(int i:adj.get(node)){
            if(vis[i]==1) return true;
            if(vis[i]==0){
                if(fun(i,vis,adj)) return true;
            }
        }
        vis[node]=2;
        return false;
    }
}