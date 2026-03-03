class Solution {
    public char findKthBit(int n, int k) {
        String s="0";
        while(n-->1){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0') sb.append('1');
                else sb.append('0');
            }
            s=s+'1'+(sb.reverse().toString());
        }
        return s.charAt(k-1);
    }
}