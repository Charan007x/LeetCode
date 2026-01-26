class Solution {
    public String[] findRelativeRanks(int[] a) {
        int n=a.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((p,q)->q[0]-p[0]);
        for(int i=0;i<n;i++) pq.add(new int[]{a[i],i});
        String[] ans=new String[n];
        int x=1;
        while(pq.size()>0){
            int b[]=pq.poll();
            int val=b[0];
            int idx=b[1];
            if(x==1){
                ans[idx]="Gold Medal";
            }else if(x==2){
                ans[idx]="Silver Medal";
            }else if(x==3){
                ans[idx]="Bronze Medal";
            }else ans[idx]=Integer.toString(x);
            x++;
        }
        return ans;
    }
}