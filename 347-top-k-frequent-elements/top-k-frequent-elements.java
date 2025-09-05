class Solution {
    public int[] topKFrequent(int[] a, int k) {
        int n = a.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((p,q)->p[0]-q[0]);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(a[i],map.getOrDefault(a[i],0)+1);
        for(int key:map.keySet()){
            pq.add(new int[]{map.get(key),key});
        }
        int ans[]=new int[k];
        while(pq.size()!=k) pq.poll();
        for(int i=0;i<k;i++) ans[i]=pq.poll()[1];
        return ans;
    }
}