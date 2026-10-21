class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n=s.length();
       if(n==0) return 0;
       HashMap<Character,Integer> map=new HashMap<>();
       int l=0,h=0;
       int ans=0;
       while(h<n){
        char ch=s.charAt(h);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.get(ch)>1){
           char ch1=s.charAt(l);
           map.put(ch1,map.get(ch1)-1);
           if(map.get(ch1)==0) map.remove(ch1);
           l++; 
        }
            ans=Math.max(ans,h-l+1);
            h++;
       } 
       return ans;
    }
}