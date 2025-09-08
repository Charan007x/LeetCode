class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=n;i++){
        boolean flag=true;
            int a=i,b=n-i;
            while(a!=0){
                int x=a%10;
                if(x==0){
                    flag=false;
                    break;
                }
                    a/=10;
            }
                while(b!=0&&flag){
                int x=b%10;
                if(x==0){
                    flag=false;
                    break;
                }
                    b/=10;                    
            }
        if(flag) return new int[]{i,n-i};
        
        }
        return new int[]{};
    }
}
