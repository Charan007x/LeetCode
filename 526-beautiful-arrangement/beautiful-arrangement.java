class Solution {
    public int countArrangement(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(n,new ArrayList<>(),ans,new boolean[n+1]);
        return ans.size();
    }
    public static void fun(int n,List<Integer> list,List<List<Integer>> ans,boolean b[]){
        if(list.size()==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=1;i<=n;i++){
            if(!b[i]){
                b[i]=true;
                list.add(i);
                if((list.get(list.size()-1)%(list.size())==0||(list.size())%list.get(list.size()-1)==0))
                fun(n,list,ans,b);
                list.remove(list.size()-1);
                b[i]=false;
            }
        }
    }
}