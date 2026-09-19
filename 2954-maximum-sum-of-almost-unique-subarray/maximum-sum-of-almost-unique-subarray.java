class Solution {
    public long maxSum(List<Integer> a, int m, int k) {
        int n=a.size();
        HashMap<Integer,Integer> map=new HashMap<>();
        long sum=0,curr=0;
        for(int i=0;i<k;i++){
            map.put(a.get(i),map.getOrDefault(a.get(i),0)+1);
            curr=curr+(long)(a.get(i));
        }
        if(map.size()>=m) sum=Math.max(sum,curr);
        int t=n-k;
        int l=0,h=k;
        while(t-->0){
            map.put(a.get(l),map.get(a.get(l))-1);
            if(map.get(a.get(l))==0) map.remove(a.get(l));
            map.put(a.get(h),map.getOrDefault(a.get(h),0)+1);
            curr=curr-(long)(a.get(l));
            curr=curr+(long)(a.get(h));
            if(map.size()>=m) sum=Math.max(sum,curr);
            l++;h++;
        }
        return sum;
    }
}