class Solution {
    public String findDifferentBinaryString(String[] a) {
        int n=a.length;
        List<String> list=new ArrayList<>();
        fun("",list,n);
        for(int i=0;i<n;i++){
            list.remove(a[i]);
        }
        return list.get(0);
    }
    public static void fun(String s,List<String> list,int n){
        if(s.length()==n){
            list.add(s);
            return;
        }
        fun(s+'0',list,n);
        fun(s+'1',list,n);
    }
}