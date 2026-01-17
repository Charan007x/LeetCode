class Solution {
    public int minOperations(int[] a, int k) {
        int x=0;
        for(int i=0;i<a.length;i++) x=x^a[i];
        int count=0;
        while(x!=0||k!=0){
            int p=x&1,q=k&1;
            if(p!=q) count++;
            x=x>>1;k=k>>1;
        }
        return count;
    }
}