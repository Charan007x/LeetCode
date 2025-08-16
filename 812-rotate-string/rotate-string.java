class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        while(n-->0){
            if(s.equals(goal)) return true;
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            s=sb.toString();
        }
        return false;
    }
}