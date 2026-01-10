class Solution {
    public int[] separateDigits(int[] a) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            String s=Integer.toString(a[i]);
            for(int j=0;j<s.length();j++){
                list.add(s.charAt(j)-'0');
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++) ans[i]=list.get(i);
        return ans;
    }
}