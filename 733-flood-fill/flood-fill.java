class Solution {
    public int[][] floodFill(int[][] a, int row, int col, int mc) {
        int m=a.length,n=a[0].length;
        int vis[][]=new int[m][n];
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{row,col});
        int c=a[row][col];
        a[row][col]=mc;
        while(q.size()>0){
            int temp[]=q.poll();
            int x=temp[0],y=temp[1];
            vis[x][y]=1;
            if(x+1<m&&vis[x+1][y]==0&&a[x+1][y]==c){
                vis[x+1][y]=1;
                a[x+1][y]=mc;
                q.add(new int[]{x+1,y});
            }
            if(x-1>=0&&vis[x-1][y]==0&&a[x-1][y]==c){
                vis[x-1][y]=1;
                a[x-1][y]=mc;
                q.add(new int[]{x-1,y});
            }if(y+1<n&&vis[x][y+1]==0&&a[x][y+1]==c){
                vis[x][y+1]=1;
                a[x][y+1]=mc;
                q.add(new int[]{x,y+1});
            }if(y-1>=0&&vis[x][y-1]==0&&a[x][y-1]==c){
                vis[x][y-1]=1;
                a[x][y-1]=mc;
                q.add(new int[]{x,y-1});
            }
        }
        return a;
    }
}