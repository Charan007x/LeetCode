class Solution {
    public int minimumDeletions(int[] a) {
        int n=a.length;
        int x=-1,y=-1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
                x=i;
            }
            if(a[i]<min){
                min=a[i];
                y=i;
            }
        }
        int l=Math.min(x,y),h=Math.max(x,y);
        return Math.min(h+1,Math.min(n-l,n-h+l+1));
    }
}