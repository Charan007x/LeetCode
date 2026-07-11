class Solution {
    public List<String> letterCasePermutation(String s) {
        int n=s.length();
        List<String> list=new ArrayList<>();
        fun(0,s,list,"");
        return list;
    }
    public static void fun(int n,String s,List<String> list,String t){
        if(n==s.length()){
            list.add(t);
            return;
        }
        if(Character.isDigit(s.charAt(n))) fun(n+1,s,list,t+s.charAt(n));
        else{
                fun(n+1,s,list,t+Character.toUpperCase(s.charAt(n)));
                fun(n+1,s,list,t+Character.toLowerCase(s.charAt(n)));
        }
    }
}