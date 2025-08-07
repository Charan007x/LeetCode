class Solution {
    public int addDigits(int n) {
        int t = n;
        int sum=0;
        while(true){
            sum=0;
            while(t>0){
                int x =t%10;
                sum+=x;
                t/=10;
            }
            if(sum/10==0) return sum;
            t=sum;
        }
    }
}