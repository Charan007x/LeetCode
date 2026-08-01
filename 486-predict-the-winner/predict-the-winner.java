class Solution {
    public boolean predictTheWinner(int[] a) {
        int n=a.length;
        int sum=0;
        for(int i:a) sum+=i;
        return fun(a,0,n-1,0,sum,sum);
    }
    public static boolean fun(int a[],int l,int h,int t,int sum,int tar){
        if(l>h){
            int pla1=tar-sum,pla2=sum;
            if(pla1>=pla2) return true;
            return false;
        }
        boolean left=true,right=false;
        left=fun(a,l+1,h,(t==0)?1:0,(t==0)?sum-a[l]:sum,tar);
        right=fun(a,l,h-1,(t==0)?1:0,(t==0)?sum-a[h]:sum,tar);
        return (t==0?left||right:left&&right);
    }
}