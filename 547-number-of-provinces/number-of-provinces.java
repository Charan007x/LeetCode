class Solution {
    public int findCircleNum(int[][] a) {
        int n=a.length;
        int vis[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                count++;
                fun(a,vis,i);
            }
        }
        return count;
    }
    public static void fun(int a[][],int vis[],int x){
        int n=a.length;
        Queue<Integer> q=new LinkedList<>();
        q.add(x);
        while(q.size()>0){
            int temp=q.poll();
            vis[temp]=1;
            for(int i=0;i<n;i++){
                if(temp!=i&&a[temp][i]==1&&vis[i]==0){
                    q.add(i);
                }
            }
        }
    }
}