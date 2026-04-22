class Solution {
    public List<List<Integer>> shiftGrid(int[][] a, int k) {
        int m=a.length,n=a[0].length;
        int len=m*n;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) list.add(a[i][j]);
        }
        k%=len;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++) ans.add(new ArrayList<>());
        int idx=len-k;
        for(int i=0;i<m;i++){
            List<Integer> x=ans.get(i);
            for(int j=0;j<n;j++){
                x.add(list.get(idx%len));
                idx++;
            }
        }
        return ans;
    }
}