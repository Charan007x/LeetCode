class Solution {
    public int evenNumberBitwiseORs(int[] a) {
        int n = a.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0) ans=ans|a[i];
        }
        return ans;
    }
}