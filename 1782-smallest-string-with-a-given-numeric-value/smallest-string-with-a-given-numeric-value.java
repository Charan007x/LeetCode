class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            int j=1;
            while(26*(n-i)<k-j){
                j++;
            }
            k-=j;
            sb.append((char)(96+j));
        }
        return sb.toString();
    }
}