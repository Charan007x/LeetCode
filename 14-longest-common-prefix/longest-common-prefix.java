class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n==1) return strs[0];
        StringBuilder sb = new StringBuilder("");
        int p=strs[0].length(),q=strs[1].length();
        if(strs[0].length()==0||strs[1].length()==0) return "";
        for(int i=0;i<Math.min(p,q);i++){
            if(strs[0].charAt(i)==strs[1].charAt(i)) sb.append(strs[0].charAt(i));
            else break;
        }
        for(int i=2;i<n;i++){
            String temp = sb.toString();
            sb=new StringBuilder("");
            p = temp.length();q=strs[i].length();
            if(p==0||q==0) return "";
            for(int j=0;j<Math.min(p,q);j++){
               if(temp.charAt(j)==strs[i].charAt(j)) sb.append(strs[i].charAt(j));
               else break; 
            }
        }
        return sb.toString();
    }
}