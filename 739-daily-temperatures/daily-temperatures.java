class Solution {
    public int[] dailyTemperatures(int[] a) {
        int n=a.length;
        if(n==1) return new int[]{0};
        int ans[]=new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0&&a[i]>=a[st.peek()]) st.pop();
            if(!st.isEmpty()) ans[i]=st.peek()-i;
            st.push(i);
        }
        return ans;
    }
}