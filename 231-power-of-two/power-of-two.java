class Solution {
    public boolean isPowerOfTwo(int n) {
        int count=0;
        if(n<0) return false;
        while(n>0){
            n&=(n-1);
            count++;
        }
        return (count==1);
    }
}