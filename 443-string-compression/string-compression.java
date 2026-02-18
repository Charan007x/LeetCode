class Solution {
    public int compress(char[] a) {
        int n=a.length;
        int x=0;
        if(n==1) return n;
        int l=0,h=1,m=0;
        while(h<n){
            if(h==n-1||a[l]!=a[h]){
                if(a[h]!=a[l]&&h==n-1) x++;
                int count=0;
                if(h==n-1&&a[l]==a[h]) count++;
                count+=h-l;
                String s=Integer.toString(count);
                a[m]=a[l];
                if(count!=1){
                for(int i=0;i<s.length();i++){
                    m++;
                    a[m]=s.charAt(i);
                }
                }
                l=h;
                m++;
                h++;
                if(m<n) a[m]=a[l];
            }
            else if(a[l]==a[h]){
                h++;
            }
        }
        return m+x;
    }
}