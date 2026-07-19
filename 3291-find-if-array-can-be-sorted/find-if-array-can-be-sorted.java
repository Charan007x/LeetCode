class Solution {
    public boolean canSortArray(int[] a) {
        int n=a.length;
        int b[]=new int[n];
        for(int i=0;i<n;i++) b[i]=a[i];
        Arrays.sort(b);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]&&fun(a[j])==fun(a[j+1])){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        return Arrays.equals(a,b);
    }
    public static int fun(int n){
        int count=0;
        while(n>0){
            int x=n&1;
            if(x==1) count++;
            n=n>>1;
        }
        return count;
    }    
}