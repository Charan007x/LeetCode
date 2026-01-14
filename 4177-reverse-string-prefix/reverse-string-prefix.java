class Solution {
    public String reversePrefix(String s, int k) {
        int n=s.length();
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<k;i++) sb.append(s.charAt(i));
       sb=sb.reverse();
       if(k==n) return sb.toString();
       sb.append(s.substring(k,n));
       return sb.toString();
    }
}