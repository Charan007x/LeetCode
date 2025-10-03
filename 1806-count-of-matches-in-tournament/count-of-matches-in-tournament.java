class Solution {
    public int numberOfMatches(int n) {
        int count=0;
        while(n>1){
            int t=n/2;
            if(n%2==0){
                 count=count+(t);
                 }
            else {
                count=count+(t)+1;
            }
            n=n/2;
        }
        return count;
    }
}