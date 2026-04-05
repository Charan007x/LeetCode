class Solution {
    public int furthestDistanceFromOrigin(String s) {
        int x=0,y=0,n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='L') x--;
            else if(ch=='R') x++;
            else y++;
        }
        return Math.max(Math.abs(x+y),Math.abs(x-y));
    }
}