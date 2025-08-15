class Solution {
    public int countPrimes(int n) {
        if(n<=1) return 0;
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int p=2;p*p<=n;p++){
            if(prime[p]){
                for(int i=p*p;i<=n;i+=p){
                    prime[i]=false;
                }
            }
        }
        int count =0;
        for(boolean x:prime){
            if(x) count++;
        }
        if(prime[n]==true) count--;
        return count;
    }
}