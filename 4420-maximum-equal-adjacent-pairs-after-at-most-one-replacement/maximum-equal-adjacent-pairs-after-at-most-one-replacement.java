class Solution {
    public int maxEqualAdjacentPairs(int[] a) {
        int n=a.length;
        HashMap<String,Integer> map=new HashMap<>();
        int cnt=0;
        for(int i=1;i<n;i++){
            int c=a[i-1],d=a[i];
            int x=Math.min(c,d);
            int y=Math.max(c,d);
            String p=""+x+"-"+y;
            if(x==y) cnt++;
            else map.put(p,map.getOrDefault(p,0)+1);
        }
        int max=0;
        for(String key:map.keySet()){
            max=Math.max(map.get(key),max);
        }
        return max+cnt;
    }
}