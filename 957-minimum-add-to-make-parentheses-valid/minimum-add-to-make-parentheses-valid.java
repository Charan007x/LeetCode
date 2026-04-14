class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(st.size()>0) st.pop();
                else count++;
            }
        }
        return count+st.size();
    }
}