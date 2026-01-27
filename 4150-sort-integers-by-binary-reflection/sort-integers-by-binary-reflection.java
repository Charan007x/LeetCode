class Solution {
    public int[] sortByReflection(int[] arr) {
        int n=arr.length;
        int a[]=Arrays.copyOf(arr,n);
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            String s=Integer.toString(a[i],2);
            s=new StringBuilder(s).reverse().toString();
            b[i]=Integer.parseInt(s,2);
        }
        Integer idx[]=new Integer[n];
        for(int i=0;i<n;i++) idx[i]=i;
        Arrays.sort(idx,(i,j)->{
            if(b[i]!=b[j]) return b[i]-b[j];
            return a[i]-a[j];
        });
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=a[idx[i]];
        }
        return c;
    }
}