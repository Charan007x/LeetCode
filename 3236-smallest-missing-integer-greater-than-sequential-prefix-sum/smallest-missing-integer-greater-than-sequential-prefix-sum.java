class Solution {
    public int missingInteger(int[] a) {
        int n=a.length;
        int sum=a[0];
        for(int i=1;i<n;i++){
            if(a[i]-a[i-1]==1) sum+=a[i];
            else break;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i:a) set.add(i);
    while(set.contains(sum)){
        sum++;
    }
    return sum;
    }
}