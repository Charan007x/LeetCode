class Solution {
    int parent[];
    int size[];
    public boolean validPath(int n, int[][] edges, int s, int d) {
       parent=new int[n];
       size=new int[n];
       for(int i=0;i<n;i++){
        parent[i]=i;
        size[i]=1;
       }
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<edges.length;i++){
        int x=edges[i][0],y=edges[i][1];
        union(x,y,parent,size);
       } 
       return(find(s,parent)==find(d,parent));
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