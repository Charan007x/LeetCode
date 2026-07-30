class Solution {
    public int[] sortJumbled(int[] a, int[] b) {
        int n=b.length;
        int c[]=new int[n];
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String s=Integer.toString(b[i]);
            int val=0;
            for(char ch:s.toCharArray()){
                int x=ch-'0';
                val=(val*10)+a[x];
            }
            if(!map.containsKey(val)) map.put(val,new ArrayList<>());
            map.get(val).add(b[i]);
            c[i]=val;
        }
        List<Integer> list=new ArrayList<>();
        for(int key:map.keySet()) list.add(key);
        Collections.sort(list);
        int x=0,j=0;
        while(j<list.size()){
            List <Integer> d =map.get(list.get(j++));
            for(int i=0;i<d.size();i++){
                c[x++]=d.get(i);
            }
        }
        return c;
    }
}