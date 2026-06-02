class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n=a.length;
        Deque<Integer> dq=new ArrayDeque<>();
        int ans[]=new int[n+1-k];
        for(int i=0;i<k;i++){
            while(dq.size()>0&&a[dq.peekLast()]<a[i]) dq.pollLast();
            dq.offerLast(i);
        }
        int l=0,h=k,x=0;
        ans[0]=a[dq.peekFirst()];
        while(h<n){
            while(dq.size()>0&&dq.peekFirst()<=h-k) dq.pollFirst();
            while(dq.size()>0&&a[dq.peekLast()]<a[h]) dq.pollLast();
            dq.offerLast(h);
            l++;h++;
            ans[++x]=a[dq.peekFirst()];
        }
        return ans;
    }
}