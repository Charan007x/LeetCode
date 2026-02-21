class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            int count=0;
            int x=i;
            while(x!=0){
                int y=x&1;
                if(y==1) count++;
                x=x>>1;
            }
            if(fun(count)) ans++;
        }
        return ans;
    }
    public static boolean fun(int x){
        if(x==2) return true;
        if(x%2==0||x==1) return false;
        if(x==3||x==5||x==7||x==11||x==13||x==17||x==19||x==23||x==29||x==31) return true;
        return false;
    }
}