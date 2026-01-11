class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(fun(s,k,'T'),fun(s,k,'F'));
    }
    public static int fun(String s,int k,char tog){
        int n=s.length();
        int l=0,h=0,max=0;
        int count=0;
        while(h<n){
            if(s.charAt(h)==tog) count++;
            while(count>k){
                if(s.charAt(l)==tog) count--;
                l++;
            }
            max=Math.max(max,h-l+1);
            h++;
        }
        return max;
    }
}