class Solution {
    public List<Integer> grayCode(int n) {
        // solved this question with a fluke, hehe
        List<Integer> list = new ArrayList<>();
        int sw[]=new int[1];
        sw[0]=0;
        fun(n,0,"",list,sw);
        return list;
    }
    public static void fun(int n,int idx,String s,List<Integer> list,int sw[]){
        if(idx==n){
            list.add(Integer.parseInt(s,2));
            sw[0]++;
            return;
        }
        if(sw[0]%2==0){
        fun(n,idx+1,s+"0",list,sw);
        sw[0]++;
        fun(n,idx+1,s+"1",list,sw);
        sw[0]++;
        }else{
            sw[0]++;
            fun(n,idx+1,s+"1",list,sw);
            sw[0]++;
            fun(n,idx+1,s+"0",list,sw);
        }
    }
}