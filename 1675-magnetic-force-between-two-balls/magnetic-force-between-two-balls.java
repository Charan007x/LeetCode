class Solution {
    public int maxDistance(int[] a, int k) {
        int n=a.length;
        Arrays.sort(a);
        int l=1;
        int h=a[n-1]-a[0];
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(fun(a,m,k)){
                ans=m;
                l=m+1;
            }else h=m-1;
        }
        return ans;
    }
    public static boolean fun(int a[],int m,int k){
        int n=a.length;
        int prev=0,count=1;
        for(int i=1;i<n;i++){
            if(Math.abs(a[prev]-a[i])>=m){
                count++;
                prev=i;
            }
        }
        return (count>=k?true:false);
    }
}