class Solution {
    public boolean isPossibleDivide(int[] a, int k) {
        int n = a.length;
        if (n%k!=0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int x:a)map.put(x,map.getOrDefault(x,0)+1);
        while(!map.isEmpty()) {
            int first=map.firstKey();
            for(int i=0;i<k;i++) {
                int key=first+i;
                if(!map.containsKey(key)) return false;
                map.put(key,map.get(key)-1);
                if(map.get(key)==0) map.remove(key);
            }
        }
        return true;
    }
}