class Solution {
    public int minimumDistance(int[] a) {
        int n=a.length;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],new ArrayList<>());
            }
            map.get(a[i]).add(i);
        }
        int min=Integer.MAX_VALUE;
        for(int key:map.keySet()){
            List<Integer> list=map.get(key);
            if(list.size()>=3){
                int x=0,y=1,z=2;
                while(z<list.size()){
                    min=Math.min(min,Math.abs(list.get(x)-list.get(y))+Math.abs(list.get(y)-list.get(z)) + Math.abs(list.get(z)-list.get(x)));
                    x++;y++;z++;
                }
            }
        }
        return (min!=Integer.MAX_VALUE?min:-1);
    }
}