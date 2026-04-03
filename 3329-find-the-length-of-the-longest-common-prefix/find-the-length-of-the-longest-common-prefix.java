class Solution {
    public int longestCommonPrefix(int[] a, int[] b) {
        int m=a.length,n=b.length;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<m;i++){
            StringBuilder sb=new StringBuilder();
            String s=Integer.toString(a[i]);
            for(int j=0;j<s.length();j++){
                sb.append(s.charAt(j));
                set.add(sb.toString());
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            String t=Integer.toString(b[i]);
            for(int j=0;j<t.length();j++){
                sb.append(t.charAt(j));
                if(set.contains(sb.toString())) ans=Math.max(ans,sb.length());
                else break;
            }
        }
        return ans;
    }
}