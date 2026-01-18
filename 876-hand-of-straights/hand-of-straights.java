class Solution {
    public boolean isNStraightHand(int[] a, int k) {
        int n=a.length;
        if(n%k!=0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++) map.put(a[i],map.getOrDefault(a[i],0)+1);
        while(!map.isEmpty()){
            int x=map.firstKey();
            for(int i=0;i<k;i++){
                int key=x+i;
                if(!map.containsKey(key)) return false;
                map.put(key,map.get(key)-1);
                if(map.get(key)==0) map.remove(key);
            }
        }
        return true;
    }
}