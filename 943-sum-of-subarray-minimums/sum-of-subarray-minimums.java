class Solution {
    public int sumSubarrayMins(int[] a) {
        int n=a.length;
        int nse[]=new int[n];
        int pse[]=new int[n];
        Arrays.fill(nse,n);
        Arrays.fill(pse,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()>0&&a[st.peek()]>=a[i]) st.pop();
            if(st.size()>0) pse[i]=st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(st.size()>0&&a[st.peek()]>a[i]) st.pop();
            if(st.size()>0) nse[i]=st.peek();
            st.push(i);
        }
        long ans=0;
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            ans=ans+((long)((long)(right)*left)*(long)(a[i]));
        }
        ans=ans%1000000007;
        return (int)(ans);
    }
}