class Solution {
    public int shipWithinDays(int[] a, int d) {
        int n=a.length;
        int l=0,h=0,ans=0;
        for(int i=0;i<n;i++){
         l=Math.max(l,a[i]);
        h+=a[i];
        }
        while(l<=h){
            int m=l+(h-l)/2;
            if(fun(a,m,d)){
                ans=m;
                h=m-1;
            }else l=m+1;
        }
        return ans;
    }
    public static boolean fun(int a[],int m,int d){
        int sum=0,count=1;
        for(int x:a){
            sum+=x;
            if(sum>m){
                sum=x;
                count++;
            }
        }
        return (count>d?false:true);
    }
}