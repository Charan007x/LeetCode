class Solution {
    public int maximumNumberOfStringPairs(String[] a) {
        int n=a.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String s=a[i];
            StringBuilder sb=new StringBuilder(s);
            String rev=sb.reverse().toString();
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
            else if(map.containsKey(rev)) map.put(rev,map.get(rev)+1);
            else map.put(s,1);
        }
        int count=0;
        for(String key:map.keySet()){
            if(map.get(key)==2) count++;
        }
        return count;
    }
}