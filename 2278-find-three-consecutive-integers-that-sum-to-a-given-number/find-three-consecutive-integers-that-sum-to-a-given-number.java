class Solution {
    public long[] sumOfThree(long num) {
        long x=num-3;
         if(num%3!=0) return new long[0];
        x/=3;
        long ans[]=new long[3];
        for(int i=0;i<3;i++){
            ans[i]=x;
            x++;
        }
        return ans;
    }
}