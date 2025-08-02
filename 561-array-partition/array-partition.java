class Solution {
    public int arrayPairSum(int[] a){
    int n = a.length;
    Arrays.sort(a);
    int sum=0;
    for(int i=0;i<n-1;i+=2){
        sum+=Math.min(a[i],a[i+1]);
    }        
    return sum;
    }
}