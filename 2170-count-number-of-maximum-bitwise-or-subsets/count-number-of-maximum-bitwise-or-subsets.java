class Solution {
    public int countMaxOrSubsets(int[] a) {
        int n=a.length;
        int max=fun(a,0,0);
        int ans[]=new int[1];
        int val=count(a,0,0,max,ans);
        return ans[0];
    }
    public static int fun(int a[],int i,int x){
        if(i==a.length) return x;
        int left=fun(a,i+1,(x|a[i]));
        int right=fun(a,i+1,x);
        return Math.max(left,right);
    }
    public static int count(int a[],int i,int x,int max,int ans[]){
        if(i==a.length){
            if(x==max) ans[0]++;
            return x;
        }
        int left=count(a,i+1,(x|a[i]),max,ans);
        int right=count(a,i+1,x,max,ans);
        return Math.max(left,right);
    }
}