class Solution {
    public boolean isPowerOfTwo(int n) {
       int x=0;
       if(n<0) return false;
       while(n!=0){
        if((n&1)==1) x++;
        n=n>>>1;
       } 
       if(x==1) return true;
       return false;
    }
}