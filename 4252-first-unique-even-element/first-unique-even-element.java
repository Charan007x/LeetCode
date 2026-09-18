class Solution {
    public int firstUniqueEven(int[] a) {
        int n=a.length;
        int ans=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(a[i])==1&&a[i]%2==0) return a[i];
        }
        return -1;
    }
}