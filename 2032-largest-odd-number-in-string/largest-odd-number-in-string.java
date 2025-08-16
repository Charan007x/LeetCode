class Solution {
    public String largestOddNumber(String s) {
        int x =0,y=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int k = ch-'0';
            if(k%2!=0){
             x =i;y=1;
            }
        }
        if(x==0&&y==0) return "";
        return s.substring(0,x+1);
    }
}