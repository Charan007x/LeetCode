class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] a) {
        int n=a.length;
        HashSet<String> set=new HashSet<>();
        for(String x:a) set.add(x);
        List<String> list=new ArrayList<>();
        for(String x:a){
            set.remove(x);
            int dp[]=new int[x.length()+1];
            Arrays.fill(dp,-1);
            int y=fun(x,0,set,dp);
            if(y>1) list.add(x);
            // list.add(Integer.toString(y));
            set.add(x);
        }
        return list;
    }
    public static int fun(String s,int n,HashSet<String> set,int dp[]){
        if(n==s.length()){
            return 0;
        }
        if(dp[n]!=-1) return dp[n];
        int ans=-100000;
        for(int i=n+1;i<=s.length();i++){
            if(set.contains(s.substring(n,i))){
                int left=1+fun(s,i,set,dp);
                ans=Math.max(left,ans);
            }
        }
        return dp[n]=ans;
    }
}