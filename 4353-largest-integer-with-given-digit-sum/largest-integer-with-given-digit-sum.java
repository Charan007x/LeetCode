class Solution {
    public int largestInteger(int n, int s) {
        int max[]=new int[1];
        max[0]=Integer.MIN_VALUE;
        fun(n,0,0,s,max,0);
        return (max[0]==Integer.MIN_VALUE?-1:max[0]);
    }
    public static void fun(int len, int val,int n,int tar,int max[],int sum){
        if(n==len){
            if(sum==tar)max[0]=Math.max(max[0],val);
            return;
        }
        if(sum>tar) return;
        for(int i=0;i<=9;i++){
            fun(len,val*10+i,n+1,tar,max,sum+i);
        }
    }
}