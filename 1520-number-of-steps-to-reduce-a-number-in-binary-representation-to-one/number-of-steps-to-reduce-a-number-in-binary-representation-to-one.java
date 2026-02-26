class Solution {
    public int numSteps(String s) {
        int count=0;
        while(true){
            if(check(s)) return count;
            int n=s.length();
            if(s.charAt(n-1)=='1'){
                s=fun1(s);
            }else{
                s=fun2(s);
            }
            count++;
        }
    }
    public static String fun1(String s){
        StringBuilder sb = new StringBuilder();
        int x=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'&&x==1){
                sb.append('0');
            }else if(s.charAt(i)=='0'&&x==1){
                sb.append('1');
                x=0;
            }else{
                sb.append(s.charAt(i));
            }
        }
        if(x==1) sb.append('1');
        return sb.reverse().toString();
    }
    public static String fun2(String s){
        int n=s.length();
        return s.substring(0,n-1);
    }
    public static boolean check(String s){
        if(s.length()==1&&s.charAt(0)=='1') return true;
        return false;
    }
}