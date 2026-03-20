class NumArray {
    int pre[];
    public NumArray(int[] a) {
        int n=a.length;
        pre=new int[n+1];
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+a[i-1];
        }
    }
    
    public int sumRange(int l, int h) {
        return pre[h+1]-pre[l];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */