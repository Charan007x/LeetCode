class Solution {
    public int subsetXORSum(int[] a) {
        int n=a.length;
        return fun(a,0,0);
    }
    public static int fun(int a[],int i,int x){
        if(i==a.length) return x;
        int left=fun(a,i+1,x^a[i]);
        int right=fun(a,i+1,x);
        return left+right;
    }
}