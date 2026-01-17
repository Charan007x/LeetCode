class Solution {
    public int[] numberGame(int[] a) {
        int n=a.length;
        int b[]=new int[n];
        Arrays.sort(a);
        for(int i=1;i<n;i+=2){
            b[i]=a[i-1];
            b[i-1]=a[i];
        }
        return b;
    }
}