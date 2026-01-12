class Solution {
    public int[] asteroidCollision(int[] a) {
       int n=a.length;
       Stack<Integer> st = new Stack<>();
       for(int i=0;i<n;i++){
        st.push(a[i]);
        while(st.size()>=2){
            int x=st.pop();
            int y=st.pop();
            if(x<0&&y>0){
                if(Math.abs(x)==Math.abs(y)) break;
                else{
                    if(Math.abs(x)>Math.abs(y)) st.push(x);
                    else st.push(y);
                }
            }else{
                st.push(y);
                st.push(x);
                break;
            }
        }
       }
       if(st.isEmpty()) return new int[0];
       int ans[]=new int[st.size()];
       for(int i=st.size()-1;i>=0;i--){
        ans[i]=st.pop();
       }
       return ans;
    }
}