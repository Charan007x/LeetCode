class StockSpanner {
    Stack<Integer> st;
    List<Integer> list;
    public static int idx;
    public StockSpanner() {
        st=new Stack<>();
        list=new ArrayList<>();
        idx=0;
    }
    
    public int next(int price) {
        list.add(price);
        while(st.size()>0&&price>=list.get(st.peek())) st.pop();
        int ans=1;
        if(st.size()>0) ans=idx-st.peek();
        if(st.size()==0) ans=idx+1;
        st.push(idx++);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */