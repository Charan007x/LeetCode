class Solution {
    public List<List<Integer>> groupThePeople(int[] a) {
        int n=a.length;
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int i=0;i<n;i++) freq.put(a[i],freq.getOrDefault(a[i],0)+1);
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(a[i])) map.put(a[i],new ArrayList<>());
            map.get(a[i]).add(i);
        }
        List<List<Integer>> ans= new ArrayList<>();
        for(int key:map.keySet()){
            int x=freq.get(key);
            int t=x/key;
            List<Integer> temp=map.get(key);
            int i=0;
            while(t-->0){
                List<Integer> list=new ArrayList<>();
                for(int j=0;j<key;j++){
                    list.add(temp.get(i));
                    i++;
                }
                ans.add(new ArrayList<>(list));
            }
        }
        return ans;
    }
}