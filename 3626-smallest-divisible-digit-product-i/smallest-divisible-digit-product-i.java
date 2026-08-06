class Solution {
    public int smallestNumber(int n, int t) {
        int k=fun(n);
        while(k%t!=0){
            n++;
            k=fun(n);
        }
        return n;
    }
    public static int fun(int n){
        int k=1;
        while(n!=0){
            int temp=n%10;
            k*=temp;
            n/=10;
        }
        return k;
    }
}