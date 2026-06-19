class NumArray {
    int n;
    int tree[];
    public NumArray(int[] a) {
        n=a.length;
        tree=new int[4*n];
        // build tree
        build(0,0,n-1,a);
    }
    public void build(int node,int start,int end,int a[]){
        if(start==end){
            tree[node]=a[start];
            return;
        }
        int mid=(start+end)/2;
        build(2*node+1,start,mid,a);
        build(2*node+2,mid+1,end,a);
        tree[node]=tree[2*node+1]+tree[2*node+2];
    }
    public void update(int index, int val) {
        update(0,0,n-1,index,val);
    }
    public int sumRange(int left, int right) {
        return query(0,0,n-1,left,right);
    } 
    public int query(int node,int start,int end,int left,int right){
        if(left>end||right<start) return 0;
        if(left<=start&&end<=right){
            return tree[node];
        }
        int mid=(start+end)/2;
        int leftSum=query(2*node+1,start,mid,left,right);
        int rightSum=query(2*node+2,mid+1,end,left,right);
        return leftSum+rightSum;
    }
    public void update(int node,int start,int end,int index,int value){
        if(start==end){
            tree[node]=value;
            return;
        }
        int mid=(start+end)/2;
        if(index<=mid) update(2*node+1,start,mid,index,value);
        else update(2*node+2,mid+1,end,index,value);
        tree[node]=tree[2*node+1]+tree[2*node+2];
    }
}