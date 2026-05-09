class Solution {
    public int[][] rotateGrid(int[][] a, int k) {
        int m=a.length,n=a[0].length;
        rec(a,k);
        return a;
    }
    public static void rec(int a[][],int k){
        int m=a.length,n=a[0].length;
        for(int i=0;i<Math.min(m,n)/2;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=i;j<m-i;j++) temp.add(a[j][i]);
            for(int j=i+1;j<n-i;j++) temp.add(a[m-1-i][j]);
            for(int j=m-2-i;j>=i;j--) temp.add(a[j][n-1-i]);
            for(int j=n-2-i;j>i;j--) temp.add(a[i][j]);
            int sz=temp.size();
            int z=0;
            int tk=k%sz;
            rotate(temp,0,sz-1);
            rotate(temp,0,tk-1);
            rotate(temp,tk,sz-1);
            for(int j=i;j<m-i;j++) a[j][i]=temp.get(z++);
            for(int j=i+1;j<n-i;j++) a[m-1-i][j]=temp.get(z++);
            for(int j=m-2-i;j>=i;j--) a[j][n-1-i]=temp.get(z++);
            for(int j=n-2-i;j>i;j--) a[i][j]=temp.get(z++);
        }
    }
    public static void rotate(List<Integer> list,int l,int h){
        while(l<h){
            int t=list.get(l);
            list.set(l,list.get(h));
            list.set(h,t);
            l++;h--;
        }
    }
}