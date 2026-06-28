class Solution {
    public int[] findIntersectionValues(int[] a, int[] b) {
        int m=a.length,n=b.length;
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<m;i++) map1.put(a[i],map1.getOrDefault(a[i],0)+1);
        for(int i=0;i<n;i++) map2.put(b[i],map2.getOrDefault(b[i],0)+1);
        int x=0,y=0;
        for(int i=0;i<m;i++){
            if(map2.containsKey(a[i])){
                x++;
            }
        }
        for(int i=0;i<n;i++){
            if(map1.containsKey(b[i])){
                y++;
            }
        }
        return new int[]{x,y};
    }
}