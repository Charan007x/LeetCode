class Solution {
    public int gcdOfOddEvenSums(int n) {
        int x=0,y=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0) x+=i;
            else y+=i;
        } 
        int a=Math.max(x,y);
        int b=Math.min(x,y);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;      
    }
}