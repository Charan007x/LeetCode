class Solution {
    public int longestSubarray(int[] a, int k) {
        int n=a.length;
        Deque<Integer> max=new ArrayDeque<>();
        Deque<Integer> min=new ArrayDeque<>();
        int l=0,h=0,ans=-1;
        while(h<n){
            while(max.size()>0&&a[max.peekLast()]<a[h]) max.pollLast();
            while(min.size()>0&&a[min.peekLast()]>a[h]) min.pollLast();
            max.offerLast(h);
            min.offerLast(h);
            while(!fun(a,max,min,k)){
                while(max.size()>0&&max.peekFirst()<=l) max.pollFirst();
                while(min.size()>0&&min.peekFirst()<=l) min.pollFirst();
                l++;
            }
            ans=Math.max(h-l+1,ans);
            h++;
        }
        return ans;
    }
    public static boolean fun(int a[],Deque<Integer> max,Deque<Integer> min,int k){
        return (Math.abs(a[max.peekFirst()]-a[min.peekFirst()])<=k);
    }
}