class Solution {
    public int minChanges(int n, int k) {
        String s=Integer.toString(n,2);
        String t=Integer.toString(k,2);
        if(s.length()>t.length()){
            while(t.length()!=s.length()) t="0"+t;
        }
        if(s.length()<t.length()) s="0"+s;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)=='0') return -1;
                else count++;
            }
        }
        return count;
    }
}