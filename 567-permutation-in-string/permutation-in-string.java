class Solution {
    public boolean checkInclusion(String s1, String s) {
        int m=s1.length();
        int n=s.length();
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<m;i++){
freq.put(s1.charAt(i),freq.getOrDefault(s1.charAt(i),0)+1);
        }
        int l=0,h=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(h<n){
            map.put(s.charAt(h),map.getOrDefault(s.charAt(h),0)+1);
            while((!freq.containsKey(s.charAt(h))&&map.containsKey(s.charAt(h)))||((freq.containsKey(s.charAt(h))&&freq.get(s.charAt(h))<map.get(s.charAt(h))))){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
                l++;
            }
            if(freq.equals(map)) return true;
            h++;
        }
        return false;
    }
}