class Solution {
    public int numWaterBottles(int fb, int ex) {
        int count=fb;
        int eb=fb;
        while(true){
            if(eb<ex) break;
            int x=eb/ex;
            eb=eb-(x*ex);
            eb+=x;
            count+=x;
        }
        return count;
    }
}