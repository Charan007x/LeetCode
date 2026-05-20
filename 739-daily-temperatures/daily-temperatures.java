class Solution {
    public int[] dailyTemperatures(int[] a) {
        int n=a.length;
        int nge[]=new int[n];
        Stack<Integer> st=new Stack<>();
        Arrays.fill(nge,n);
        for(int i=n-1;i>=0;i--){
            while(st.size()>0&&a[st.peek()]<=a[i]) st.pop();
            if(st.size()>0) nge[i]=st.peek();
            st.push(i);
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(nge[i]==n) ans[i]=0;
            else ans[i]=nge[i]-i;
        }
        return ans;
    }
}