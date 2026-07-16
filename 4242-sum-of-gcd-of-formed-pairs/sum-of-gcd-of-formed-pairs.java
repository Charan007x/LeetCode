class Solution {
    public long gcdSum(int[] a) {
        int n=a.length;
        int max[]=new int[n];
        int mx=-1;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,a[i]);
            max[i]=Math.max(a[i],mx);
        }
        int pre[]=new int[n];
        for(int i=0;i<n;i++){
            pre[i]=gcd(max[i],a[i]);
        }
        Arrays.sort(pre);
        int l=0,h=n-1;
        long ans=0;
        while(l<h){
            ans+=(gcd(pre[l],pre[h]));
            l++;h--;
        }
        return ans;
    }
    public static int gcd(int x,int y){
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