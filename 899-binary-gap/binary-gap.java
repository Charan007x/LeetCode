class Solution {
    public int binaryGap(int n) {
        String s=Integer.toString(n,2);
        int max=0,last=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(last!=-1){
                max=Math.max(max,i-last);
                }
                last=i;
            }
        }
        return (last==-1?0:max);
    }
}