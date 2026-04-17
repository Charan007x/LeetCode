class Solution {
    public int minMirrorPairDistance(int[] a) {
        int n=a.length;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        HashMap<Integer,Integer> point=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],new ArrayList<>());
            }
            map.get(a[i]).add(i);
        }
        for(int key:map.keySet()) point.put(key,0);
        int ans=Integer.MAX_VALUE;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            String s=Integer.toString(a[i]);
            StringBuilder sb=new StringBuilder(s);
            s=sb.reverse().toString();
            int x=Integer.parseInt(s);
            if(map.containsKey(x)){
                List<Integer> list=map.get(x);
                for(int j=point.get(x);j<list.size();j++){
                    if(i<list.get(j)){
                    ans=Math.min(ans,Math.abs(list.get(j)-i));
                    point.put(x,j);
                    break;
                    }
                }
            }
        }
        return (ans!=Integer.MAX_VALUE?ans:-1);
    }
}