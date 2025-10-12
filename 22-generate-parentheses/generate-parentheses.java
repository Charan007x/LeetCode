class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        fun(ans,0,0,"",n);
        return ans;
    }
    public static void fun(List<String> ans,int l,int r,String s,int n){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(l<n){
            fun(ans,l+1,r,s+'(',n);
        }
        if(r<l){
            fun(ans,l,r+1,s+')',n);
        }
    }
}