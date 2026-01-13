class Solution {
    public int[] nextGreaterElements(int[] a) {
        int n=a.length;
        int nge[]=new int[2*n-1];
        Stack<Integer> st =new Stack<>();
        nge[2*n-2]=-1;
        for(int i=2*n-2;i>=0;i--){
            while(st.size()>0&&a[i%n]>=st.peek()) st.pop();
            if(st.size()>0) nge[i]=st.peek();
            else nge[i]=-1;
            st.push(a[i%n]);
        }
        int ans[]=Arrays.copyOf(nge,n);
        return ans;
    }
}