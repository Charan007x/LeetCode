class Solution {
    public List<List<Integer>> permute(int[] a) {
        int n=a.length;
        List<List<Integer>>ans=new ArrayList<>();
        fun(a,0,new ArrayList<>(),ans,new boolean[n]);
        return ans;
    }
    public static void fun(int a[],int n,List<Integer> list,List<List<Integer>> ans,boolean vis[]){
        if(n==a.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(!vis[i]){
                vis[i]=true;
                list.add(a[i]);
                fun(a,n+1,list,ans,vis);
                vis[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
}