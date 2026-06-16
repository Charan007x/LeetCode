class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch>=97&&ch<=122) sb.append(ch);
            else if(sb.length()!=0&&ch=='*') sb.deleteCharAt(sb.length()-1);
            else if(ch=='#'){
                if(sb.length()!=0) sb.append(sb.toString());
            } 
            else if(ch=='%') sb.reverse();
        }
        return sb.toString();
    }
}