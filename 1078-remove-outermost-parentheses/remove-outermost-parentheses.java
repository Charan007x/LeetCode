class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            if(st.size()>1) sb.append(ch);
            if(!st.isEmpty()&&ch==')') st.pop();
        }
        return sb.toString();
    }
}