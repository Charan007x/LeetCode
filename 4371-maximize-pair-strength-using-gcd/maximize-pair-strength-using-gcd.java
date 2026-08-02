class Solution {
    public long maxPairStrength(int[] a) {
        int n=a.length;
        long ans=-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
            int x=a[i],y=a[j];
            int p=gcd(x,y);
            long val=((long)(x)*y)/((long)(p)*p);
            ans=Math.max(val,ans);
            }
        }
        return ans;
    }
    public static int gcd(int x, int y){
        int a=Math.max(x,y);
        int b=Math.min(x,y);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}