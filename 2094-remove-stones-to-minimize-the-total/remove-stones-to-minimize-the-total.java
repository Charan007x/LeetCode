class Solution {
    public int minStoneSum(int[] a, int k) {
        int n=a.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((p,q)->q-p);
        int sum=0;
        for(int x:a){
            sum+=x;
            pq.add(x);
        }
        int act=0;
        for(int i=0;i<k;i++){
            int x=pq.poll();
            int t=(x%2==0)?0:1;
            x/=2;
            act+=x;
            pq.add(x+t);
        }
        return sum-act;
    }
}