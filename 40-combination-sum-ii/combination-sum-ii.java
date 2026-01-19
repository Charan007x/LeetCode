class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int tar) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(a);
        fun(a,0,0,tar,new ArrayList<>(),res);
        return res;
    }
    public static void fun(int a[],int idx,int sum,int tar,List<Integer> curr,List<List<Integer>> res){
        if(sum==tar){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<a.length;i++){
            if(i>idx&&a[i]==a[i-1]) continue;
            if(sum+a[i]>tar) continue;
            curr.add(a[i]);
            fun(a,i+1,sum+a[i],tar,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}