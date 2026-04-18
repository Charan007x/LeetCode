class Solution {
    public int mirrorDistance(int n) {
        String s=Integer.toString(n);
        StringBuilder sb=new StringBuilder(s);
        s=sb.reverse().toString();
        int x=Integer.parseInt(s);
        return Math.abs(n-x);
    }
}