class Solution {
    public boolean wordPattern(String t, String s) {
        String a[]=s.split(" ");
        if(a.length!=t.length()) return false;
        HashMap<Character,String> map=new HashMap<>();
        int n=t.length();
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)&&!((map.get(ch)).equals(a[i]))) return false;
            else map.put(ch,a[i]);
        }
        HashMap<String,Character> map1=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            if(map1.containsKey(a[i])&&!((map1.get(a[i]))==ch)) return false;
            else map1.put(a[i],ch);
        }
        return true;
    }
}