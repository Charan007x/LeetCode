class Solution {
    public int maxPower(String s) {
        int n=s.length();
        int max=0;
        int l=0,h=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(h<n){
            char ch=s.charAt(h);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>1){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
                l++;
            }
            max=Math.max(max,h-l+1);
            h++;
        }
        return max;
    }
}