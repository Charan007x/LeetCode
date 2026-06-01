class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length(),n=s2.length();
        if(m>n) return false;
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<m;i++){
            char ch=s1.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
          char ch=s2.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map.equals(freq)) return true;
        int l=0,h=m;
        while(h<n){
            map.put(s2.charAt(l),map.get(s2.charAt(l))-1);
            if(map.get(s2.charAt(l))==0) map.remove(s2.charAt(l));
            map.put(s2.charAt(h),map.getOrDefault(s2.charAt(h),0)+1);
            if(map.equals(freq)) return true;
            l++;h++;
        }
        return false;
    }
}