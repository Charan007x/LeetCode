class Solution {
    public int mySqrt(int x) {
        long l=0,h=x,ans=0;
        while(l<=h){
            long m=l+(h-l)/2;
            if(m*m<=x){
                ans=m;
                l=m+1;
            }else h=m-1; 
        }
        return (int)ans;
    }
}