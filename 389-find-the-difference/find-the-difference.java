class Solution {
    public char findTheDifference(String s, String t) {
        int x=0;
        for(int i=0;i<s.length();i++) x=x^s.charAt(i);
        for(int i=0;i<t.length();i++) x=x^t.charAt(i);
        return (char)x;
    }
}