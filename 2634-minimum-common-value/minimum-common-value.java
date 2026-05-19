class Solution {
    public int getCommon(int[] a, int[] b) {
        int m=a.length,n=b.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<m;i++) set.add(a[i]);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(set.contains(b[i])) min=Math.min(min,b[i]);
        }
        return (min!=Integer.MAX_VALUE?min:-1);
    }
}