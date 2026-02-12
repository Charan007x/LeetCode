class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map=new HashMap<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                boolean flag=true;
                int x=map.get(ch);
                for(char key:map.keySet()){
                    if(x!=map.get(key)) flag =false;
                }
                if(flag) max=Math.max(max,map.size()*x);
            }
        }
        return max;
    }
}