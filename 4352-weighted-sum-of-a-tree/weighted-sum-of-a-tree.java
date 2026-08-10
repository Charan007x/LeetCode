class Solution {
    public long weightedSum(int[] a, int[] b) {
        int n=a.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=1;i<n;i++){
            adj.get(a[i]).add(i);
        }
        long ans=0;
        int vis[]=new int[n];
        int h=depth(0,adj,vis);
        Arrays.fill(vis,0);
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=1;
        ans+=((long)(b[0])*(h-1+1));
        int d=2;
        while(q.size()>0){
            int sz=q.size();
            for(int j=0;j<sz;j++){
                int temp=q.poll();
            for(int i:adj.get(temp)){
                if(vis[i]==0){
                    vis[i]=1;
                    q.add(i);
                    ans+=((long)(b[i])*(h-d+1));
                }
            }
            }
            d++;
        }
        return ans;
    }
    public static int depth(int node,List<List<Integer>>adj,int vis[]){
        if(vis[node]==1) return 0;
        int left=1;
        vis[node]=1;
        for(int i:adj.get(node)){
            if(vis[i]==0){
                left=Math.max(left,1+depth(i,adj,vis));
            }
        }
        return left;
    }
}