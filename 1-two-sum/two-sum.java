class Solution {
    public int[] twoSum(int[] a, int k) {
      int n = a.length;
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<n;i++){
        int x = k-a[i];
        if(map.containsKey(k-a[i])) return new int[]{map.get(x),i};
        else map.put(a[i],i);
      }
      return a;
    }
}