class Solution {
    public int[] findOrder(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        int vis[]=new int[n];
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int x=edges[i][0];
            int y=edges[i][1];
            adj.get(y).add(x);
        }
        Stack<Integer> st=new Stack<>();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(dfs(i,vis,adj)) return new int[]{};
            }
        }
        Arrays.fill(vis,0);
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                fun(i,vis,adj,st);
            }
        }
        int ans[]=new int[n];
        int x=0;
        while(st.size()>0){
            ans[x++]=st.pop();
        }
        return ans;
    }
    public static void fun(int node,int vis[],List<List<Integer>> adj,Stack<Integer> st){
        vis[node]=1;
        for(int i:adj.get(node)){
            if(vis[i]==0){
                fun(i,vis,adj,st);
            }
        }
        st.push(node);
    }
    public static boolean dfs(int node,int vis[],List<List<Integer>> adj){
        vis[node]=1;
        for(int i:adj.get(node)){
            if(vis[i]==1) return true;
            if(vis[i]==0){
                if(dfs(i,vis,adj)) return true;
            }
        }
        vis[node]=2;
        return false;
    }
}