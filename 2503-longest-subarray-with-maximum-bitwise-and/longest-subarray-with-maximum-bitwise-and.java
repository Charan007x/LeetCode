class Solution {
    public int longestSubarray(int[] a) {
        int n=a.length;
        int max=-1;
        for(int i:a) max=Math.max(i,max);
        int ans=0,count=0;
        for(int i=0;i<n;i++){
            if(a[i]==max){
                count++;
                if(i==n-1) ans=Math.max(ans,count);
            }else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        return ans;
    }
}