class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=9;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<=9;j++){
                sb.append(j);
                String s=sb.toString();
                int val=Integer.parseInt(s);
                if(val>=low&&val<=high) ans.add(val);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}