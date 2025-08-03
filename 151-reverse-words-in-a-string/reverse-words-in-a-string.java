class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
                if(i==n-1) list.add(sb.toString());
            }
            else if(ch==' '){
                if(sb.length()!=0){
                    list.add(sb.toString());
                    sb= new StringBuilder("");
                }
                    else continue;
            }
        }
        Collections.reverse(list);
        StringBuilder ans = new StringBuilder("");
        for(String x: list){
            ans.append(x);
            ans.append(' ');
        }
        return ans.toString().trim();
    }
}