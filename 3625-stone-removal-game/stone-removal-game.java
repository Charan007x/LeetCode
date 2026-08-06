class Solution {
    public boolean canAliceWin(int n) {
        int x=10,t=0;
        while(x>0){
            if(n-x<0){
                return (t!=0);
            }
            n=n-x;
            x--;
            t=(t==1)?0:1;
        }
        return true;
    }
}