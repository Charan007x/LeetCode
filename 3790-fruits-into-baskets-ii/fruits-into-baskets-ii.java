class Solution {
    public int numOfUnplacedFruits(int[] a, int[] b) {
        int n=a.length,count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<=b[j]){
                    count++;
                    b[j]=-1;
                    break;
                }
            }
        }
        return n-count;
    }
}