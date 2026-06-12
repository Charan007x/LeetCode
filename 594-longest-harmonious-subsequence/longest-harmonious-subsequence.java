class Solution {
    public int findLHS(int[] a) {
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++) map.put(a[i],map.getOrDefault(a[i],0)+1);
        List<Integer> list=new ArrayList<>();
        for(int key:map.keySet()) list.add(key);
        Collections.sort(list);
        if(list.size()==1) return 0;
        int ans=0;
        int m=list.size();
        for(int i=1;i<m;i++){
            if(list.get(i)-list.get(i-1)==1){
                int curr=map.get(list.get(i))+map.get(list.get(i-1));
                ans=Math.max(ans,curr);
            }
        }
        return ans;
    }
}