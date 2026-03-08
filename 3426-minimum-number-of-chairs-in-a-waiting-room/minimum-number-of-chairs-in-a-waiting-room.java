class Solution {
    public int minimumChairs(String s) {
        int n=s.length();
        int max=0,count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='E') count++;
            else count--;
            max=Math.max(max,count);
        }
        return max;
    }
}