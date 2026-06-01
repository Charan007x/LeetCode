class Solution {
    public int minimumCost(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        int sum=0;
        for(int i=n-1;i>=2;i-=3){
            sum+=a[i]+a[i-1];
        }
        if(n%3==1) sum+=a[0];
        if(n%3==2) sum+=(a[0]+a[1]);
        return sum;
    }
}