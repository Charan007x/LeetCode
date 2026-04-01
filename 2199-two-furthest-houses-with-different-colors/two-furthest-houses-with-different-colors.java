class Solution {
    public int maxDistance(int[] a) {
        int n=a.length;
        int x=-1,y=-1;
        int l=0,h=n-1;
        while(l<h){
            if(a[l]!=a[h]){
                x=h-l;
                break;
            }
            l++;
        }
        l=0;h=n-1;
        while(l<h){
            if(a[l]!=a[h]){
                y=h-l;
                break;
            }
            h--;
        }
        return Math.max(x,y);
    }
}