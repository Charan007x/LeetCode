class Solution {
    public int[][] kClosest(int[][] a, int k) {
        int n=a.length;
        HashMap<Integer,Double> map=new HashMap<>();
        for(int i=0;i<n;i++){
            double val=fun(a[i][0],a[i][1]);
            map.put(i,val);
        }
        PriorityQueue<Map.Entry<Integer,Double>> pq=new PriorityQueue<>((p,q)->{
            return Double.compare(p.getValue(),q.getValue());
        });
        pq.addAll(map.entrySet());
        int ans[][]=new int[k][2];
        for(int i=0;i<k;i++){
            Map.Entry<Integer,Double> e=pq.poll();
            int x=e.getKey();
            ans[i][0]=a[x][0];
            ans[i][1]=a[x][1];
        }
        return ans;
    }
    public static double fun(int x,int y){
        double ans=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return ans;
    }
}