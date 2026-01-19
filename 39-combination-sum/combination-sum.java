class Solution {
    public List<List<Integer>> combinationSum(int[] a, int tar) {
        List<List<Integer>> res= new ArrayList<>();
        fun(a,0,0,new ArrayList<>(),res,tar);
        return res;
    }
    public static void fun(int a[],int idx,int sum,List<Integer>curr,List<List<Integer>> res,int tar){
        if(sum==tar){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<a.length;i++){
            if(sum>tar) continue;
            curr.add(a[i]);
            fun(a,i,sum+a[i],curr,res,tar);
            curr.remove(curr.size()-1);
        }
    }
}