class Solution {
    public int minOperations(List<Integer> list, int k) {
        int n=list.size();
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        for(int i=n-1;i>=0;i--){
            count++;
            if(list.get(i)<=k) set.add(list.get(i));
            if(set.size()==k) return count;
        }
        return count;
    }
}