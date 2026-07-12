class Solution {
    public int beautifulSubsets(int[] a, int k) {
        int n=a.length;
        List<List<Integer>> ans=new ArrayList<>();
        fun(a,new ArrayList<>(),ans,0,k);
        return ans.size()-1;
    }
    public static void fun(int a[],List<Integer> list,List<List<Integer>> ans,int n,int k){
        if(n==a.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(val(a[n],list,k)){
            list.add(a[n]);
            fun(a,list,ans,n+1,k);
            list.remove(list.size()-1);
        }
        fun(a,list,ans,n+1,k);
    }
    public static boolean val(int x,List<Integer> list,int k){
        if(list.size()==0) return true;
        for(int i:list){
            if(Math.abs(i-x)==k) return false;
        }
        return true;
    }
}