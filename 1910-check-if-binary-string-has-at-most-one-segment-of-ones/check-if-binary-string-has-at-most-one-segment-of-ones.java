class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length();
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(!flag&&s.charAt(i)=='1') return false;
            if(s.charAt(i)=='0') flag=false;
        }
        return true;
    }
}