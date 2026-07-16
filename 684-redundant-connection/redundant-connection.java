class Solution {
    int parent[];
    int size[];
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        parent=new int[n+1];
        size=new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
            size[i]=1;
        }
        for(int i=0;i<n;i++){
            int x=edges[i][0],y=edges[i][1];
            if(find(x,parent)==find(y,parent)) return new int[]{x,y};
            union(x,y,parent,size);
        }
        return new int[]{};
    }
    public static int find(int x,int parent[]){
        if(parent[x]==x) return x;
        return parent[x]=find(parent[x],parent);
    }
    public static void union(int x,int y,int parent[],int size[]){
        int pa=find(x,parent);
        int pb=find(y,parent);
        if(pa==pb) return;
        if(size[pa]<size[pb]){
            parent[pa]=pb;
            size[pb]+=size[pa];
        }else{
            parent[pb]=pa;
            size[pa]+=size[pb];
        }
    }
}