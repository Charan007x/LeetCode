class Solution {
    public List<String> buildArray(int[] a, int k) {
        int n=a.length,x=0;
        List<String> list=new ArrayList<>();
        for(int i=1;i<=k&&x<n;i++){
            list.add("Push");
            if(a[x]==i){
                x++;
            }else{
                list.add("Pop");
            }
        }
        return list;
    }
}