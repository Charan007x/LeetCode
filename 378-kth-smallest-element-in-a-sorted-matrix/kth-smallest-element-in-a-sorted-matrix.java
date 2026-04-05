class Solution {
    public int kthSmallest(int[][] a, int k) {
        int n=a.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>((x,y)->(y-x));
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.add(a[i][j]);
                if(pq.size()>k) pq.poll();
            }
        }
        return pq.peek();
    }
}