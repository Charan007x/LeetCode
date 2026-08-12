class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] a, int[][] b) {
        int m=a.length,n=b.length;
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++) map1.put(a[i][0],a[i][1]);
        for(int i=0;i<n;i++) map2.put(b[i][0],b[i][1]);
        List<Integer> idx=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int key:map1.keySet()) set.add(key);
        for(int key:map2.keySet()) set.add(key);
        for(int key:set) idx.add(key);
        Collections.sort(idx);
        int p=0,q=0;
        for(int i=0;i<idx.size();i++){
            List<Integer> list=new ArrayList<>();
            int x=idx.get(i);
            int val=0;
            if(map1.containsKey(x)){
                val+=map1.get(x);
                p++;
            }else{
                if(p==m) val+=0;
                else val+=a[p][1];
            }
            if(map2.containsKey(x)){
                val+=map2.get(x);
                q++;
            }else{
                if(q==n) val+=0;
                else val+=b[q][1];
            }
            list.add(x);
            list.add(val);
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}