class Solution {
    public int minEatingSpeed(int[] a, int k) {
        int n=a.length;
        int l=1,h=Arrays.stream(a).max().getAsInt();
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(fun(a,m,k)){
                ans=m;
                h=m-1;
            } else l=m+1;
        }
        return ans;
    }
    public static boolean fun(int a[],int m,int k){
        int n=a.length;
        long count=0;
        for(int i=0;i<n;i++){
            long x=a[i]/m;
            long y=(a[i]%m==0)?x:x+1;
            count+=y;
        }
        return (count<=k);
    }
}