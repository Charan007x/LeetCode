class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        fun("",list,0,n);
        return list;
    }
    public static void fun(String s,List<String> list,int idx,int n){
        if(s.length()==n){
            list.add(s);
            return;
        }
        if(idx==0) fun(s+'0',list,idx+1,n);
        else{
            if(s.charAt(idx-1)=='1') fun(s+'0',list,idx+1,n);
        }
        fun(s+'1',list,idx+1,n);
    }
}