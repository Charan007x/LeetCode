class Solution {
    public boolean findRotation(int[][] a, int[][] tar) {
        int n=a.length;
        for(int i=0;i<=3;i++){
        if(fun(a,tar)) return true;
        rotate(a);
        }
        return false;
    }
    public static void rotate(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            int l=0,h=n-1;
            while(l<h){
                int t=a[i][l];
                a[i][l]=a[i][h];
                a[i][h]=t;
                l++;h--;
            }
        }
    }
    public static boolean fun(int a[][],int tar[][]){
        int n=a.length;
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(!Arrays.equals(a[i],tar[i])) flag=false;
        }
        return flag;
    }
}