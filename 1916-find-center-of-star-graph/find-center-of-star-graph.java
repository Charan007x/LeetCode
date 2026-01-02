class Solution {
    public int findCenter(int[][] a) {
        int n=a.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0,max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
            map.put(a[i][j],map.getOrDefault(a[i][j],0)+1);
            if(map.get(a[i][j])>max){
                ans=a[i][j];
                max=map.get(a[i][j]);
            }
            }
        }
        return ans;
    }
}