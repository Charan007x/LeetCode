class Solution {
    public int halveArray(int[] a) {
        int n=a.length;
        double sum=0;
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:a){
        pq.add((double)x);
        sum=sum+(double)x;
        }
        int count=0;double curr=0;
        while(curr<sum/2){
            double x=pq.poll();
            x/=2;
            curr+=x;
            pq.add(x);
            count++;
        }
        return count;
    }
}