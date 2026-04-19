class Solution {
    public int maxDistance(int[] a, int[] b) {
        int m=a.length,n=b.length;
        int ans=0;
        for(int i=0;i<m;i++){
            int j=-1;
            int l=i,h=n-1;
            while(l<=h){
                int mid=((h-l)/2+l);
                if(a[i]<=b[mid]){
                    j=mid;
                    l=mid+1;
                }else h=mid-1;
            }
            if(j!=-1) ans=Math.max(ans,j-i);
        }
        return ans;
    }
}