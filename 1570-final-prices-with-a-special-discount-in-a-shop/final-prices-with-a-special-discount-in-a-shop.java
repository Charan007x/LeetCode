class Solution {
    public int[] finalPrices(int[] a) {
        int n=a.length;
        int ans[]=new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(a[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty()&&a[i]<st.peek()) st.pop();
            if(!st.isEmpty()) ans[i]=st.peek();
            st.push(a[i]);
        }
        for(int i=0;i<n;i++) ans[i]=a[i]-ans[i];
        return ans;
    }
}