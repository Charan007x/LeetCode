class Solution {
    public int numEnclaves(int[][] a) {
        int m=a.length,n=a[0].length;
        int vis[][]=new int[m][n];
        for(int i=0;i<n;i++){
            if(a[0][i]==1) fun(a,vis,0,i);
        }
        for(int i=0;i<n;i++){
            if(a[m-1][i]==1) fun(a,vis,m-1,i);
        }
        for(int i=0;i<m;i++){
        if(a[i][0]==1) fun(a,vis,i,0);
        }
        for(int i=0;i<m;i++){
            if(a[i][n-1]==1) fun(a,vis,i,n-1);
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1&&vis[i][j]==0) count++;
            }
        }
        return count;
    }
    public static void fun(int a[][],int vis[][],int i,int j){
        int m=a.length,n=a[0].length;
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{i,j});
        vis[i][j]=1;
        while(q.size()>0){
            int temp[]=q.poll();
            int x=temp[0],y=temp[1];
            if(x+1<m&&a[x+1][y]==1&&vis[x+1][y]==0){
                vis[x+1][y]=1;
                q.add(new int[]{x+1,y});
            }if(y+1<n&&a[x][y+1]==1&&vis[x][y+1]==0){
                vis[x][y+1]=1;
                q.add(new int[]{x,y+1});
            }
            if(x-1>=0&&a[x-1][y]==1&&vis[x-1][y]==0){
                vis[x-1][y]=1;
                q.add(new int[]{x-1,y});
            }if(y-1>=0&&a[x][y-1]==1&&vis[x][y-1]==0){
                vis[x][y-1]=1;
                q.add(new int[]{x,y-1});
            }
        }
    }
}