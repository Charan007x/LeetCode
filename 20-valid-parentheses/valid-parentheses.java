class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        boolean flag = true;
        char ch = ' ';
        for(int i=0;i<s.length();i++){
           ch = s.charAt(i);
           if(ch=='(') st.push('(');
           else if(ch=='[') st.push('[');
           else if(ch=='{') st.push('{');
           else if(st.size()==0) flag = false;
           else if(ch==')'&&st.peek()=='(') st.pop();
           else if(ch==']'&&st.peek()=='[') st.pop();
           else if(ch=='}'&&st.peek()=='{') st.pop();
           else flag = false;
        }
        if(st.size()!=0) return false;
        return flag;
    }
}