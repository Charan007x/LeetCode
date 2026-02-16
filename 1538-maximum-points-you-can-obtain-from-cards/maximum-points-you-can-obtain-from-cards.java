class Solution {
    public int maxScore(int[] a, int k) {
        int n=a.length;
        long tot=0;
        for(int i=0;i<n;i++) tot=tot+(long)a[i];
        if(k==a.length) return (int)tot;

        int sz=n-k;
        int l=0,h=sz;
        long sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<sz;i++) sum+=(long)a[i];
        min=Math.min(min,sum);
        int t=n-sz;
        while(t-->0){
            if(h<n) sum+=a[h];
            sum-=a[l];
            l++;h++;
        min=Math.min(min,sum);
        }
        return (int)(tot-min);
    }
}