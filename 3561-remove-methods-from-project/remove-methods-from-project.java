class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int x=edges[i][0],y=edges[i][1];
            adj.get(x).add(y);
        }
        int vis[]=new int[n];
        HashSet<Integer> set=new HashSet<>();
        dfs(k,vis,adj);
        for(int i=0;i<n;i++){
            if(vis[i]==1) set.add(i);
        }
        int count[]=new int[1];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,vis,set,adj,count);
            }
        }
        List<Integer> ans=new ArrayList<>();
        if(count[0]==0){
            for(int i=0;i<n;i++){
                if(!set.contains(i)) ans.add(i);
            }
        }else{
            for(int i=0;i<n;i++) ans.add(i);
        }
        return ans;
    }
    public static void dfs(int node,int vis[],List<List<Integer>> adj){
        if(vis[node]==1) return;
        vis[node]=1;
        for(int i:adj.get(node)){
            if(vis[i]==0){
                dfs(i,vis,adj);
            }
        }
    }
    public static void dfs(int node,int vis[],HashSet<Integer> set,List<List<Integer>> adj,int count[]){
        if(vis[node]==1) return;
        vis[node]=1;
        for(int i:adj.get(node)){
            if(set.contains(i)) count[0]++;
            if(vis[i]==0){
                dfs(i,vis,set,adj,count);
            }
        }
    }
}