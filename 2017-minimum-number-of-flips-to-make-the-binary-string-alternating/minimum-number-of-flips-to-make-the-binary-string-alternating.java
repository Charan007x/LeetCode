class Solution {
    public int minFlips(String s) {
        int n=s.length();
        String st=s+s;
        int x=0,y=0,ans=Integer.MAX_VALUE;
        int l=0,h=0;
        while(h<st.length()){
                if((h%2==0&&st.charAt(h)=='1')||(h%2==1&&st.charAt(h)=='0'))x++;  
                if((h%2==0&&st.charAt(h)=='0')||(h%2==1&&st.charAt(h)=='1'))y++;
            if(h>=n){
                if((l%2==0&&st.charAt(l)=='1')||(l%2==1&&st.charAt(l)=='0'))x--;  
                if((l%2==0&&st.charAt(l)=='0')||(l%2==1&&st.charAt(l)=='1'))y--;
            }
            if(h>=n-1){
                ans=Math.min(x,Math.min(y,ans));
            }  
            h++;
            if(h>n) l++;
        }
        return ans;
    }
}