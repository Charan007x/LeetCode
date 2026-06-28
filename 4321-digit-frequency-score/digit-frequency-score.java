class Solution {
    public int digitFrequencyScore(int n) {
        String s=Integer.toString(n);
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ans=0;
        for(char key:map.keySet()){
            ans+=(((key-'0'))*map.get(key));
        }
        return ans;
    }
}