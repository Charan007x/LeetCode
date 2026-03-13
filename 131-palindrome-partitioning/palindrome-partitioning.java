class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        fun(s,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void fun(String s,int n,List<String> list,List<List<String>> ans){
        if(n==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=n+1;i<=s.length();i++){
           if(pal(s.substring(n,i))){
            list.add(s.substring(n,i));
            fun(s,i,list,ans);
            list.remove(list.size()-1);
           } 
        }
    }
    public static boolean pal(String s){
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        if(s.equals(rev))return true;
        return false;
    }
}