class Solution {
    public int removeCoveredIntervals(int[][] a) {
        int n=a.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(a[j][0]>=a[i][0]&&a[j][1]<=a[i][1]) set.add(j);
                }
            }
        }
        return n-set.size();
    }
}