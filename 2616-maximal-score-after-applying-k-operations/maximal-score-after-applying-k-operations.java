class Solution {
    public long maxKelements(int[] a, int k) {
        int n=a.length;
        long ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:a) pq.add(x);
        for(int i=0;i<k;i++){
            int x=pq.poll();
            ans=ans+(long)x;
            x=(x%3==0)?x/3:x/3+1;
            pq.add(x);
        }
        return ans;
    }
}