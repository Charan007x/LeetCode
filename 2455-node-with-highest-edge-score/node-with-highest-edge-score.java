class Solution {
    public int edgeScore(int[] a) {
        int n=a.length;
        HashMap<Integer,Long> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],(long)0)+(long)i);
        }
        long max=-1;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(map.containsKey(i)&&map.get(i)>max){
                max=map.get(i);
                ans=i;
            }
        }
        return ans;
    }
}