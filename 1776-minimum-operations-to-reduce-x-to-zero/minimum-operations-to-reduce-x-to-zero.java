class Solution {
    public int minOperations(int[] a, int x) {
        int n=a.length;
        int l=0,h=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(h<2*n){
            sum+=a[h%n];
            while(sum>x){
                sum-=a[l%n];
                l++;
            }
            if(sum==x){
                int curr=Integer.MAX_VALUE;
                if(l==0&&h<n) curr=h+1;
                else if(h==n-1&&l>=0) curr=h-l+1;
                else if(l<n&&h>=n&&h-l+1<=n) curr=h-l+1;
                ans=Math.min(curr,ans);
            }
            h++;
        }
        return (ans==Integer.MAX_VALUE?-1:ans);
    }
}