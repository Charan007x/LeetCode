class Solution {
    public List<String> topKFrequent(String[] a, int k) {
        int n=a.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++) map.put(a[i],map.getOrDefault(a[i],0)+1);
        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>((x,y)->{
            if(x.getValue()!=y.getValue()) return y.getValue()-x.getValue();
         return x.getKey().compareTo(y.getKey());
        });
        pq.addAll(map.entrySet());
        List<String> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            Map.Entry<String,Integer> e=pq.poll();
            list.add(e.getKey());
        }
        return list;
    }
}