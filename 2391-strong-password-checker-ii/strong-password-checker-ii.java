class Solution {
    public boolean strongPasswordCheckerII(String s) {
        int n=s.length();
        if(n<8) return false;
        boolean lo=false,up=false,di=false,sp=false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>=65&&ch<=90) lo=true;
            else if(ch>=97&&ch<=122) up=true;
            else if(ch>='0'&&ch<='9') di=true;
            else sp=true;
        }
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)) return false;
        }
        return (lo&&up&&di&&sp);
    }
}