class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int l=0,h=0;
        int count=0;
        while(l<m&&h<n){
            if(s.charAt(l)==t.charAt(h)){
                count++;l++;h++;
            }
            else h++;
        }
        return (count==m);
    }
}