class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        int d=a|b;
        while(c!=0||d!=0){
            int p=a&1,q=b&1,r=c&1;
            int s=p|q;
            if(r!=s){
            if(r==0){
                if(p==1&&q==1) count+=2;
                else if((p==0&&q==1)||(p==1&&q==0)) count++;
            }else{
                if(p==0&&q==0) count++;
            }
            }
            a=a>>1;b=b>>1;c=c>>1;d=d>>1;
        }
        return count;
    }
}