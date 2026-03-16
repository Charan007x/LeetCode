class Solution {
    public String smallestNumber(String s) {
        List<String> list=new ArrayList<>();
        fun(s,"",list);
        Collections.sort(list);
        return list.get(0);
    }
    public static void fun(String s,String t,List<String> list){
        if(t.length()==1+s.length()){
            list.add(t);
            return;
        }
        for(int i=1;i<=9;i++){
            if(help(t+i)){
                if(t.length()==0) fun(s,t+i,list);
                else if(t.length()>0){
                    int x=t.charAt(t.length()-1)-'0';
                if((s.charAt(t.length()-1)=='I'&&i>x)||(s.charAt(t.length()-1)=='D'&&i<x)){
                        fun(s,t+i,list);
                    }
                }
            }
        }
    }
    public static boolean help(String s){
        HashSet<Character> set = new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(set.contains(s.charAt(i))) return false;
            set.add(s.charAt(i));
        }
        return true;
    }
}