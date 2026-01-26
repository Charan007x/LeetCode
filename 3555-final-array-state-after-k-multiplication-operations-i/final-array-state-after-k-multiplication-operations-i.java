class Solution {
    public int[] getFinalState(int[] a, int k, int m) {
        int n=a.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((p,q)->(p[0]!=q[0])?Integer.compare(p[0],q[0]):Integer.compare(p[1],q[1]));
        for(int i=0;i<n;i++){
            pq.add(new int[]{a[i],i});
        }
        for(int i=0;i<k;i++){
            int x[]=pq.poll();
            a[x[1]]*=m;
            pq.add(new int[]{a[x[1]],x[1]});
        }
        return a;
    }
}