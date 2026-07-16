class Solution {
    public int longestSubarray(int[] a) {
        int n=a.length;
        int max=-1;
        for(int i:a) max=Math.max(i,max);
        int l=0,h=0,ans=1;
        while(h<n){
            if(a[l]!=max&&a[h]==max)l=h;
            while(a[h]!=max&&l<h){
                l++;
            }
            ans=Math.max(ans,h-l+1);
            h++;
        }
        return ans;
    }
}