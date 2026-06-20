class Solution {
    public int countMajoritySubarrays(int[] a, int tar) {
        int n=a.length,count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map=new HashMap<>();
            int max=0;
            for(int j=i;j<n;j++){
                map.put(a[j],map.getOrDefault(a[j],0)+1);
                if(map.containsKey(tar)&&2*map.get(tar)>j-i+1) count++;
            }
        }
        return count;
    }
}