class Solution {
    public int minLength(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='B'){
                if(st.size()>0&&st.peek()=='A') st.pop();
                else st.push(ch);
            }else if(ch=='D'){
                if(st.size()>0&&st.peek()=='C') st.pop();
                else st.push(ch);
            }else st.push(ch);
        }
       return st.size();
    }
}