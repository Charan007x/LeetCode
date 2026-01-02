class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        int l=0,h=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(h<n){
            map.put(s.charAt(h),map.getOrDefault(s.charAt(h),0)+1);
            while(map.get(s.charAt(h))>1){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
                l++;
            }
            ans=Math.max(ans,h-l+1);
            h++;
        }
        return ans;
    }
}