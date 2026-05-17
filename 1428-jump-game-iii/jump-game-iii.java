class Solution {
    public boolean canReach(int[] a, int start) {
        int n=a.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        HashSet<Integer> set = new HashSet<>();
        while(q.size()>0){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                int temp=q.poll();
                set.add(temp);
                if(a[temp]==0) return true;
                if((temp+a[temp]<=n-1)&&!set.contains(temp+a[temp])) q.add(temp+a[temp]);
                if(temp-a[temp]>=0&&!set.contains(temp-a[temp])) q.add(temp-a[temp]);
            }
        }
        return false;
    }
}