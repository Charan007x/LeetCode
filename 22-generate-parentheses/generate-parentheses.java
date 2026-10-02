class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        fun(2*n,list,"",0,0);
        return list;
    }
    public static void fun(int n,List<String> list,String s, int x,int y){
        if(s.length()==n){
            list.add(s);
            return;
        }
        if(x<n/2) fun(n,list,s+"(",x+1,y);
        if(y<x) fun(n,list,s+")",x,y+1);
    }
}