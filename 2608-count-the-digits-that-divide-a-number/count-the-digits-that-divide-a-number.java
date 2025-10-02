class Solution {
    public int countDigits(int num) {
        int n = Integer.toString(num).length();
        int y=10,count=0;
        int z=num;
        for(int i=0;i<n;i++){
            int x=z%10;
            if(num%x==0) count++;
            z/=10;
        }
        return count;
    }
}