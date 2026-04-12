class Solution {
    public void solve(char[][] a){
        int m=a.length,n=a[0].length;
        int vis[][]=new int[m][n];
        for(int i=0;i<n;i++){
            if(a[0][i]=='O') fun(a,vis,0,i);
        }
        for(int i=0;i<n;i++){
            if(a[m-1][i]=='O') fun(a,vis,m-1,i);
        }
        for(int i=0;i<m;i++){
            if(a[i][0]=='O') fun(a,vis,i,0);
        }
        for(int i=0;i<m;i++){
            if(a[i][n-1]=='O') fun(a,vis,i,n-1);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]=='O'&&vis[i][j]==0){
                    a[i][j]='X';
                }
            }
        }
    }
    public static void fun(char a[][],int vis[][],int i,int j){
        int m=a.length,n=a[0].length;
        Queue<int []>q=new LinkedList<>();
        q.add(new int[]{i,j});
        vis[i][j]=1;
        while(q.size()>0){
            int temp[]=q.poll();
            int x=temp[0],y=temp[1];
            if(x+1<m&&a[x+1][y]=='O'&&vis[x+1][y]==0){
                q.add(new int[]{x+1,y});
                vis[x+1][y]=1;
            }if(y+1<n&&a[x][y+1]=='O'&&vis[x][y+1]==0){
                q.add(new int[]{x,y+1});
                vis[x][y+1]=1;
            }
            if(x-1>=0&&a[x-1][y]=='O'&&vis[x-1][y]==0){
                q.add(new int[]{x-1,y});
                vis[x-1][y]=1;
            } if(y-1>=0&&a[x][y-1]=='O'&&vis[x][y-1]==0){
                q.add(new int[]{x,y-1});
                vis[x][y-1]=1;
            }
        }
    }
}