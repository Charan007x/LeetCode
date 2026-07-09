class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        long sum=0,val=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='0'){
            sum+=((long)(ch-'0'));
            val=(val*10)+(ch-'0');
            }
        }
        return val*sum;
    }
}