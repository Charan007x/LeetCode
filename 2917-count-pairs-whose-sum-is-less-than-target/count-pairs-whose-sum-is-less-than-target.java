class Solution {
    public int countPairs(List<Integer> a, int tar) {
        int n = a.size();
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a.get(i)+a.get(j)<tar) count++;
            }
        }
        return count;
    }
}