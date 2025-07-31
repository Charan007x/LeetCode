class Solution {
    public boolean isPalindrome(String s) {
        s=s.strip();
        int n = s.length();
        s=s.toLowerCase();
        int l=0,h=n-1;
        while(l<h){
            while(l<h&&!Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l<h&&!Character.isLetterOrDigit(s.charAt(h))) h--;
            if(s.charAt(l)!=s.charAt(h)) return false;
            l++;h--;
        }
        return true;
    }
}