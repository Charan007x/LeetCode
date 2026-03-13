class Solution {
    public List<String> wordBreak(String s, List<String> list) {
        int n=s.length();
        HashSet<String> set = new HashSet<>();
        for(String x:list) set.add(x);
        List<String> ans=new ArrayList<>();
        fun(s,set,ans,"",0);
        return ans;
    }
    public static void fun(String s,HashSet<String> set,List<String> ans,String t,int n){
        if(n==s.length()){
            ans.add(t.trim());
            return;
        }
        for(int i=n+1;i<=s.length();i++){
            if(set.contains(s.substring(n,i))) fun(s,set,ans,t+s.substring(n,i)+" ",i);
        }
    }
}