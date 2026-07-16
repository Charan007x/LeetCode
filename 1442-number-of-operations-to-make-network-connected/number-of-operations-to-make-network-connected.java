class Solution {
    int parent[];
    int size[];
    public int makeConnected(int n, int[][] a) {
        parent=new int[n];
        size=new int[n];
        int count=0;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
           parent[i]=i;
           size[i]=1;
        }
        for(int i=0;i<a.length;i++){
            int x=a[i][0],y=a[i][1];
            if(find(x,parent)==find(y,parent)) count++;
            union(x,y,parent,size);
        }
        for(int i=0;i<n;i++){
            int x=find(i,parent);
            if(!map.containsKey(x)) map.put(x,new ArrayList<>());
            map.get(x).add(i);
        }
        int sz=map.size();
        if(count>=sz-1){
            return sz-1;
        }
        return -1;
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