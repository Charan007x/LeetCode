class Solution {
    public int totalWaviness(int x, int y) {
        int count=0;
        for(int i=x;i<=y;i++){
            String s=Integer.toString(i);
            if(s.length()<=2) continue;
            int l=0,h=2;
            while(h<s.length()){
                int a=s.charAt(l)-'0';
                int b=s.charAt(l+1)-'0';
                int c=s.charAt(h)-'0';
                if(a<b&&b>c) count++;
                if(a>b&&b<c) count++;
                l++;h++;
            }
        }
        return count;
    }
}