class Solution {
    public List<List<String>> accountsMerge(List<List<String>> a) {
        int m=a.size();
        HashMap<String,List<Integer>> map1=new HashMap<>();
        HashMap<Integer,HashSet<String>> map2=new HashMap<>();
        for(int i=0;i<m;i++){
            List<String> list=a.get(i);
            if(!map1.containsKey(list.get(0))) map1.put(list.get(0),new ArrayList<>());
            map1.get(list.get(0)).add(i);
            HashSet<String> set=new HashSet<>();
            for(int j=1;j<list.size();j++) set.add(list.get(j));
            map2.put(i,new HashSet<>(set));
        }
        int vis[]=new int[m];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<m;i++) adj.add(new ArrayList<>());
        for(String key:map1.keySet()){
            List<Integer> list=map1.get(key);
            int n=list.size();
            if(list.size()>1){
                for(int j=0;j<n-1;j++){
                    for(int k=j+1;k<n;k++){
                        HashSet<String> set1=map2.get(list.get(j));
                        HashSet<String> set2=map2.get(list.get(k));
                        for(String x:set1){
                            if(set2.contains(x)){
                                adj.get(list.get(j)).add(list.get(k));
                                adj.get(list.get(k)).add(list.get(j));
                                break;
                            }
                        }
                    }
                }
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            HashSet<String> set=new HashSet<>();
            if(vis[i]==0){
                vis[i]=1;
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                while(q.size()>0){
                    int temp=q.poll();
                    for(String s:map2.get(temp)) set.add(s);
                    for(int node:adj.get(temp)){
                        if(vis[node]==0){
                            vis[node]=1;
                            q.add(node);
                        }
                    }
                }
                List<String> b=new ArrayList<>();
            for(String s:set) b.add(s);
            Collections.sort(b);
            List<String> list=new ArrayList<>();
            list.add(a.get(i).get(0));
            for(int j=0;j<b.size();j++) list.add(b.get(j));
            ans.add(new ArrayList<>(list));
            }
        }
        return ans;
    }
}