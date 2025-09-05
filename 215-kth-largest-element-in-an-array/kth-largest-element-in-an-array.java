class Solution {
    public int findKthLargest(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x:a) pq.add(x);
        while(k!=pq.size()) pq.poll();
        return pq.peek();
    }
}