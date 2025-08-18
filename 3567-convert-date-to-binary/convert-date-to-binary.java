class Solution {
    public String convertDateToBinary(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='-'||i==n-1){
                if(i==n-1) sb.append(ch);
                String temp = sb.toString();
                int x = Integer.parseInt(temp);
                ans.append(Integer.toString(x,2));
                if(i!=n-1) {
                    ans.append(ch);
                    }
                sb=new StringBuilder("");
            }
            else sb.append(ch);
        }
        return ans.toString();
    }
}