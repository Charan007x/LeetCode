class Solution {
    public int countCompleteComponents(int n, int[][] edg) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        int vis[]=new int[n];
        for(int i=0;i<edg.length;i++){
            int x=edg[i][0],y=edg[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(fun(adj,vis,i)) ans++;
            }
        }
        return ans;
    }
    public static boolean fun(List<List<Integer>> adj,int vis[],int x){
        Queue<Integer> q=new LinkedList<>();
        int node=0,edg=0;
        q.add(x);
        while(q.size()>0){
            int temp=q.poll();
            node++;
            vis[temp]=1;
            edg+=adj.get(temp).size();
            for(int i:adj.get(temp)){
                if(vis[i]==0){
                    q.add(i);
                    vis[i]=1;
                }
            }
        }
        return (((node)*(node-1))==edg);
    }
}