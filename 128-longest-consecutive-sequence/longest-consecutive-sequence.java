class Solution {
    public int longestConsecutive(int[] a) {
        int n=a.length;
        if(n==0) return 0;
        Arrays.sort(a);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++) set.add(a[i]);
        List<Integer> list=new ArrayList<>();
        for(int x:set) list.add(x);
        Collections.sort(list);
        int max=1;
        for(int i=1;i<list.size();i++){
            int count=1;
            while(i<list.size()&&list.get(i)-list.get(i-1)==1){
                count++;
                i++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}