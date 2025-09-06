class Solution {
    public int splitNum(int num) {
       String s = Integer.toString(num);
       char ch[]=s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int n = ch.length;
        for(int i=0;i<n;i++){
            if(i%2==0) sb1.append(ch[i]);
            else sb2.append(ch[i]);
        }
        int ans = Integer.parseInt(sb1.toString())+Integer.parseInt(sb2.toString());
        return ans;
    }
}