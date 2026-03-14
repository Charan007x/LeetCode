class Solution {
    public String getHappyString(int n, int k) {
        char a[]={'a','b','c'};
        List<String> list = new ArrayList<>();
        fun(a,0,n,"",list);
        if(k>list.size()) return "";
        return list.get(k-1);
    }
    public static void fun(char[] a,int idx,int n,String s,List<String> list){
        if(idx==n){
            list.add(s);
            return;
        }
        for(int i=0;i<3;i++){
            if(s.length()==0)fun(a,idx+1,n,s+a[i],list);
            else if(s.length()>0&&a[i]!=s.charAt(s.length()-1))fun(a,idx+1,n,s+a[i],list);
        }
    }
}