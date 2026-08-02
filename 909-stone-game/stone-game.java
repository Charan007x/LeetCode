class Solution {
    public boolean stoneGame(int[] a) {
        int n = a.length;
        int l=0,h=n-1;
        int alice=0,bob=0;
        for(int i=0;i<n;i++){
            if(i%2==0){ // alice
               if(a[l]>=a[h]){
                 alice+=a[l];
                 l++;
            }else{
                alice+=a[h];
                h--;
            }
            }
            else{ // bob
            if(a[l]>=a[h]){
                bob+=a[h];
                h--;
            }else{
                bob+=a[l];
                l++;
            }
            }
        }
            if(alice>bob) return true;
            else return false;
    }
}