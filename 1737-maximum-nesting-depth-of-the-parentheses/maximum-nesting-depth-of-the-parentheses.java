class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int max=0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            max = Math.max(st.size(),max);
            if(ch=='(') st.push('(');
            else if(ch==')') st.pop();
        }
        return max;
    }
}