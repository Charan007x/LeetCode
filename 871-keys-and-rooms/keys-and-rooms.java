class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> list) {
        HashSet<Integer> set=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        List<Integer> x=list.get(0);
        for(int i=0;i<x.size();i++) q.add(x.get(i));
        set.add(0);
        while(q.size()>0){
            int k=q.poll();
            if(!set.contains(k)){
                x=list.get(k);
                for(int i=0;i<x.size();i++) q.add(x.get(i));
            }
            set.add(k);
        }
        return (set.size()==list.size());
    }
}