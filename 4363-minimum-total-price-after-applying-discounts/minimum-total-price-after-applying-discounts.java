class Solution {
    public double minPrice(int[] a, int[] b) {
        int m=a.length,n=b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int j=n-1;
        double c[]=new double[m];
        for(int i=m-1;i>=0;i--){
            int p=a[i];
            if(j>=0){
                int d=b[j];
                c[i]=((double)p*(100-(double)d))/100;
                j--;
            }else c[i]=(double)a[i];
        }
        double ans=0;
        for(double x:c) ans+=x;
        return ans;
    }
}