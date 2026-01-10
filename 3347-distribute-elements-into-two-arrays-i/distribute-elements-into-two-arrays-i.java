class Solution {
    public int[] resultArray(int[] a) {
        int n=a.length;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        list1.add(a[0]);
        list2.add(a[1]);
        for(int i=2;i<n;i++){
            int sz1=list1.size();
            int sz2=list2.size();
            if(list1.get(sz1-1)>list2.get(sz2-1)) list1.add(a[i]);
            else list2.add(a[i]);
        }
        int ans[]=new int[n];
        for(int i=0;i<list1.size();i++) ans[i]=list1.get(i);
        for(int i=0;i<list2.size();i++) ans[i+list1.size()]=list2.get(i);
        return ans;
    }
}