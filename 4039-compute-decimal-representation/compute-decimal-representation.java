class Solution {
    public int[] decimalRepresentation(int n) {
        int cnt=Integer.toString(n).length();
        List<Integer> list=new ArrayList<>();
        int y=10;
        for(int i=0;i<cnt;i++){
            int x=n%y;
           if(x!=0) list.add(x);
            y=y*10;
            n-=x;
        }
        Collections.reverse(list);
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}