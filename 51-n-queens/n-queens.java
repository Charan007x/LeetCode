class Solution {
    public List<List<String>> solveNQueens(int n) {
        int a[][]=new int[n][n];
        int b[]=new int[n];
        List<List<String>> ans=new ArrayList<>();
        fun(a,b,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void fun(int a[][],int b[],int m,List<String> list,List<List<String>> ans){
        if(m==a.length){
            if(list.size()==a.length) ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<a.length;i++){ // loop through columns
            if(b[i]!=1){ // put queen
            // check principal and other diag
            boolean flag=check(a,m,i);
            if(flag){
                String s="";
                a[m][i]=1;
                b[i]=1;
                for(int j=0;j<a.length;j++){
                    if(i==j) s=s+"Q";
                    else s=s+".";
                }
                list.add(s);
                fun(a,b,m+1,list,ans);
                list.remove(list.size()-1);
                a[m][i]=0;
                b[i]=0;
            }
        }
        }
    }
    public static boolean check(int a[][],int m,int n){
        // principal diag
        int s=Math.min(m-0,n-0);
        int x=m-s,y=n-s;
        int count=0;
        while(x<a.length&&y<a.length){
            if(a[x][y]==1) return false;
            x++;y++;
        }
        s=Math.min(m-0,a.length-n-1);
        x=m-s;y=n+s;
        while(x<a.length&&y>=0){
              if(a[x][y]==1) return false;
             x++;y--;
        }
        return true;
    }
}