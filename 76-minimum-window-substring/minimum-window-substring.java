class Solution {
    public String minWindow(String s, String t) {
        int m=s.length(),n=t.length();
        if(n>m) return "";
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,h=0,min=Integer.MAX_VALUE;
        String ans="";
        while(h<m){
            char ch=s.charAt(h);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(fun(freq,map)){
                if(h-l+1<min){
                    min=h-l+1;
                    ans=s.substring(l,h+1);
                }
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
                l++;
            }
            h++;
        }
        return ans;
    }
    public static boolean fun(HashMap<Character,Integer> freq,HashMap<Character,Integer> map){
        for(char key:freq.keySet()){
            if(!map.containsKey(key)) return false;
            if(map.get(key)<freq.get(key)) return false;
        }
        return true;
    }
}