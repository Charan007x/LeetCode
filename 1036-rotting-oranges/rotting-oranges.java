class Solution {
    public int orangesRotting(int[][] a) {
        int m=a.length,n=a[0].length;
        Queue<int []> q= new LinkedList<>();
        int vis[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==2){
                    q.add(new int[]{i,j});
                    vis[i][j]=1;
                }
            }
        }
        
        int t=q.size();
        int ans=-1;
        while(q.size()>0){
            ans++;
            for(int i=0;i<t;i++){
                int temp[]=q.poll();
                int x=temp[0],y=temp[1];
                if(x+1<m&&vis[x+1][y]==0&&a[x+1][y]==1){
                    vis[x+1][y]=1;
                    a[x+1][y]=2;
                    q.add(new int[]{x+1,y});
                }
                if(x-1>=0&&vis[x-1][y]==0&&a[x-1][y]==1){
                    vis[x-1][y]=1;
                    a[x-1][y]=2;
                    q.add(new int[]{x-1,y});
                }
                if(y+1<n&&vis[x][y+1]==0&&a[x][y+1]==1){
                    vis[x][y+1]=1;
                    a[x][y+1]=2;
                    q.add(new int[]{x,y+1});
                }
                if(y-1>=0&&vis[x][y-1]==0&&a[x][y-1]==1){
                    vis[x][y-1]=1;
                    a[x][y-1]=2;
                    q.add(new int[]{x,y-1});
                }
            }
            t=q.size();
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1) return -1;
                if(a[i][j]==0) count++;
            }
        }
        if(count==m*n) return 0;
        return ans;
    }
}