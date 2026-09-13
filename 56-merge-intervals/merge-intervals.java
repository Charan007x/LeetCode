class Solution {
    public int[][] merge(int[][] a) {
        int n=a.length;
        if(n==1) return a;
        Integer idx[]=new Integer[n];
        for(int i=0;i<n;i++) idx[i]=i;
        int p[]=new int[n];
        int q[]=new int[n];
        for(int i=0;i<n;i++){
            p[i]=a[i][0];
            q[i]=a[i][1];
        }
        Arrays.sort(idx,(i,j)->{
            return p[i]-p[j];
        });
        int c[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=p[idx[i]];
            d[i]=q[idx[i]];
        }
        int l=0,h=1;
        List<List<Integer>> ans=new ArrayList<>();
        while(h<n){
            List<Integer> list=new ArrayList<>();
            int end=d[l];
            while(h<n&&end>=c[h]){
                if(d[h]>=end)end=d[h];
                h++;
            }
            list.add(c[l]);
            list.add(end);
            l=h;
            ans.add(new ArrayList<>(list));
        }
        int m=ans.size();
        int fin[][]=new int[m][2];
        for(int i=0;i<m;i++){
            fin[i][0]=ans.get(i).get(0);
            fin[i][1]=ans.get(i).get(1);
        }
        return fin;
    }
}