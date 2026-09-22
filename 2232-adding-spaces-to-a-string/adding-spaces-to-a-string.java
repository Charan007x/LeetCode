class Solution {
    public String addSpaces(String s, int[] a) {
        int n=s.length(),m=a.length;
        StringBuilder sb=new StringBuilder();
        int x=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(x<m&&i==a[x]){
                sb.append(" ");
                x++;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}