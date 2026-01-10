class Solution {
    public int findKthPositive(int[] a, int k) {
        int n=a.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) set.add(a[i]);
        int count=0,x=1;
        while(true){
            if(!set.contains(x)) count++;
            if(count==k) return x;
            x++;
        }
    }
}