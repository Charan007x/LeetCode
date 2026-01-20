class Solution {
    public int[] minBitwiseArray(List<Integer> list) {
        int n=list.size();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=-1;
            for(int j=1;j<list.get(i);j++){
                if((j|(j+1))==list.get(i)){
                    ans[i]=j;
                    break;
                }
            }
        }
        return ans;
    }
}