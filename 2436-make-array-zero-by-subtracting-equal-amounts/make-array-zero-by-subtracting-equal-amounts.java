class Solution {
    public int minimumOperations(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:a){
            if(x>0) set.add(x);
        }
        return set.size();
    }
}