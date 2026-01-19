class Solution {
    public List<String> letterCombinations(String ip) {
        List<String> list= new ArrayList<>();
        fun(list,ip,0,"");
        return list;
    }
    public static void fun(List<String> list,String ip,int n,String s){
        if(n==ip.length()){
            list.add(s);
            return;
        }
        String x=cha(ip.charAt(n)-'0');
        for(int i=0;i<x.length();i++){
            fun(list,ip,n+1,s+x.charAt(i));
        }
    }
    public static String cha(int num){
        if(num==2) return "abc";
        else if(num==3) return "def";
        else if(num==4) return "ghi";
        else if(num==5) return "jkl";
        else if(num==6) return "mno";
        else if(num==7) return "pqrs";
        else if(num==8) return "tuv";
        return "wxyz";
    }
}