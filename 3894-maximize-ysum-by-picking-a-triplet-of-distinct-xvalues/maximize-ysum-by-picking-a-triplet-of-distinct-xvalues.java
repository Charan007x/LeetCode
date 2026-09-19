class Solution {
    public int maxSumDistinctTriplet(int[] a, int[] b) {
        int n=a.length;
        HashSet<Integer> set=new HashSet<>();
        for(int x:a) set.add(x);
        if(set.size()<3) return -1;
        Integer[] idx=new Integer[n];
        for(int i=0;i<n;i++) idx[i]=i;
        Arrays.sort(idx,(i,j)->{
            return b[i]-b[j];
        });
        int c[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=a[idx[i]];
            d[i]=b[idx[i]];
        }
        int sum=d[n-1];
        int k=n-1,h=n-2;
        while(c[k]==c[h]) h--;
        sum+=d[h];
        int l=h-1;
        while(c[l]==c[h]||c[h]==c[k]||c[k]==c[l]) l--;
        sum+=d[l];
        return sum;
    }
}