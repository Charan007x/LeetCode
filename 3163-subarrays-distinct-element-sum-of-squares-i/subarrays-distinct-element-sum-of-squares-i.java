class Solution {
    public int sumCounts(List<Integer> a) {
        int n=a.size();
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++){
            map=new HashMap<>();
            for(int j=i;j<n;j++){
                map.put(a.get(j),map.getOrDefault(a.get(j),0)+1);
                ans+=((map.size())*(map.size()));
            }
        }
        return ans;
    }
}