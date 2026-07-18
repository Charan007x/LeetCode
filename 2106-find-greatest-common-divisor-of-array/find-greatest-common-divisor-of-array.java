class Solution {
    public int findGCD(int[] a) {
        int x=Arrays.stream(a).min().getAsInt();
        int y=Arrays.stream(a).max().getAsInt();
        int ans=1;
        for(int i=1;i<=x;i++){
           if(x%i==0&&y%i==0){
            ans=i;
           }
        }
        return ans;
    }
}