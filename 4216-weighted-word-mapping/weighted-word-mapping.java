class Solution {
    public String mapWordWeights(String[] a, int[] b) {
        int m=a.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            String s=a[i];
            int sc=0,n=s.length();
            for(int j=0;j<n;j++){
                int x=s.charAt(j)-'a';
                sc+=b[x];
            }
            sc%=26;
            sb.append((char)(122-sc)); 
        }
        return sb.toString();
    }
}