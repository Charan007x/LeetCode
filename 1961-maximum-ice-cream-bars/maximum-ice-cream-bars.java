class Solution {
    public int maxIceCream(int[] a, int tar) {
        int n=a.length;
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]<=tar){
                tar-=a[i];
                count++;
            }else break;
        }
        return count;
    }
}