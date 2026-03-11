class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toString(n,2);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) sb.append((s.charAt(i)=='1')?'0':'1');
        s=sb.toString();
        return Integer.parseInt(s,2);
    }
}