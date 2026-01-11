class Solution {
    public long waysToBuyPensPencils(int tot, int a, int b) {
        long ans=0;
        int x=tot/a;
        for(int i=0;i<=x;i++){
            ans=ans+(long)((tot-(i*a))/b)+1;
        }
        return ans;
    }
}