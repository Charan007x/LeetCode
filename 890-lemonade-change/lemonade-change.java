class Solution {
    public boolean lemonadeChange(int[] a) {
        int n = a.length;
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(a[i]==5) x++;
            else if(a[i]==10){
                y++;
                if(x>=1) x--;
                else return false;
            }
            else if(a[i]==20){
                if(y>=1&&x>=1){
                    y--;x--;
                }
                else if(x>=3) x-=3;
                else return false;
            }
        }
        return true;
    }
}