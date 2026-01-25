class Solution {
    public long pickGifts(int[] a, int k) {
        int n=a.length;
        PriorityQueue <Integer> pq=new PriorityQueue<>((p,q)->q-p);
        long sum=0;
        for(int x:a) pq.add(x);
        for(int i=0;i<k;i++){
            if(pq.size()>0){
           int x=pq.poll();
           x=(int)Math.sqrt(x);
           pq.add(x);
            }
        }
        while(pq.size()>0) sum=sum+(long)pq.poll();
        return sum;
    }
}