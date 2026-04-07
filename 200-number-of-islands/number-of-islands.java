class Solution {
    public int numIslands(char[][] a) {
        int m=a.length,n=a[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]=='1'){
                    count++;
                    fun(a,i,j);
                }
            }
        }
        return count;
    }
    public static void fun(char a[][],int i,int j){
        int m=a.length,n=a[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,j});
        while(q.size()>0){
            int temp[]=q.poll();
            int x=temp[0],y=temp[1];
            a[x][y]='0';
            if(x+1<m&&a[x+1][y]=='1'){
                q.add(new int[]{x+1,y});
                a[x+1][y]='0';
            }
            if(x-1>=0&&a[x-1][y]=='1'){
                q.add(new int[]{x-1,y});
                a[x-1][y]='0';
            }
            if(y+1<n&&a[x][y+1]=='1'){
                 q.add(new int[]{x,y+1});
                 a[x][y+1]='0';
            }
            if(y-1>=0&&a[x][y-1]=='1'){
                q.add(new int[]{x,y-1});
                a[x][y-1]='0';
            }
        }
    }
}