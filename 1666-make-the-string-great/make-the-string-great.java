class Solution {
    public String makeGood(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
        if((st.size()>0)&&(Character.isLowerCase(ch)&&st.peek()==Character.toUpperCase(ch))) st.pop();
        else if((st.size()>0)&&(Character.isUpperCase(ch)&&st.peek()==Character.toLowerCase(ch))) st.pop();
        else st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0) sb.append(st.pop());
        return sb.reverse().toString();
    }
}