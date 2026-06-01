class Solution {
    public int minimumCost(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        if(n==1) return a[0];
        if(n==2) return a[0]+a[1];
        int sum=0;
        for(int i=n-1;i>=2;i-=3){
            sum+=a[i]+a[i-1];
        }
        if(n%3==1) sum+=a[0];
        if(n%3==2) sum+=(a[0]+a[1]);
        return sum;
    }
}