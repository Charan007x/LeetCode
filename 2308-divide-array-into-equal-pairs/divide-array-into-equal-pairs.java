class Solution {
    public boolean divideArray(int[] a) {
        int n=a.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(a[i],map.getOrDefault(a[i],0)+1);
        for(int key:map.keySet()){
            if(map.get(key)%2!=0) return false;
        }
        return true;
    }
}