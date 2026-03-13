class Solution {
    public boolean wordBreak(String s, List<String> list) {
        HashSet<String> set=new HashSet<>();
        int n=s.length();
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        for(String x:list) set.add(x);
        return fun(s,0,set,dp);
    }
    public static boolean fun(String s,int n,HashSet<String> set,int dp[]){
        if(n==s.length()) return true;
        if(dp[n]!=-1) return (dp[n]==1?true:false);
        boolean flag=false;
     for(int i=n+1;i<=s.length();i++){
        if(set.contains(s.substring(n,i))){
            boolean left=fun(s,i,set,dp);
            flag=flag|left;
        }
     }
     dp[n]=(flag==true?1:0);
     return flag;   
    }
}