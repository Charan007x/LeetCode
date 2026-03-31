class Solution {
    public int[] replaceElements(int[] a) {
        int n=a.length;
        int b[]=new int[n];
        int x=-1;
        for(int i=n-1;i>=0;i--){
            b[i]=x;
            x=Math.max(a[i],x);
        }
        return b;
    }
}