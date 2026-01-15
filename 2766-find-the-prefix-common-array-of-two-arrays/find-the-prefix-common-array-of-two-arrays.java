class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int n=a.length;
        HashSet<Integer> set = new HashSet<>();
        int ans[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(set.contains(a[i])) count++;
            if(!set.contains(a[i])) set.add(a[i]);
            if(set.contains(b[i])) count++;
            if(!set.contains(b[i])) set.add(b[i]);
            ans[i]=count;
        }
        return ans;
    }
}