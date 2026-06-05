class Solution {
    public int maxLength(List<String> list) {
        return fun(list,list.size()-1,"");
    }
    public static int fun(List<String> list,int n,String s){
        if(n<0){
            return len(s);
        }
        int left=fun(list,n-1,s+list.get(n));
        int right=fun(list,n-1,s);
        return Math.max(left,right);
    }
    public static int len(String s){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)) return 0;
            set.add(ch);
        }
        return s.length();
    }
}