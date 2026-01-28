class Solution {
    public int countCollisions(String s) {
        int n=s.length();
        int ans=0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            st.push(ch);
            while(st.size()>1){
                char x=st.pop();
                char y=st.pop();
                if(x=='L'&&y=='R'){
                    ans+=2;
                    st.push('S');
                }else if((x=='S'&&y=='R')||(x=='L'&&y=='S')){
                    ans+=1;
                    st.push('S');
                }else{
                    st.push(y);
                    st.push(x);
                    break;
                }
            }

        }
        return ans;
    }
}