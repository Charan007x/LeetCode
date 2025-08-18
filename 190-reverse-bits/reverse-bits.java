class Solution {
    public int reverseBits(int n) {
        int k=n;
        StringBuilder sb = new StringBuilder("");
        while(k!=0){
            sb.append(k%2);
            k/=2;
        }
        while(sb.length()<32){
            sb.append(0);
        }
        String s = sb.toString();
        return Integer.parseInt(s,2);
    }
}