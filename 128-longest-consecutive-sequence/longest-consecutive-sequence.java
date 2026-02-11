class Solution {
    public int longestConsecutive(int[] a) {
        int n = a.length;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();
        for(int i:a) set.add(i);
        int curr=0,max=0,x=0;
        for(int i=0;i<n;i++){
            x=a[i]-1;curr=1;
            if(seen.contains(a[i])) continue;
            seen.add(a[i]);
            while(set.contains(x)){
                seen.add(x);
                curr++;x--;
            }
            x=a[i]+1;
            while(set.contains(x)){
                seen.add(x);
                curr++;x++;
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}