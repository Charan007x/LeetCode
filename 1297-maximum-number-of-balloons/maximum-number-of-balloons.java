class Solution {
    public int maxNumberOfBalloons(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        int ans=0;
        while(true){
            if(map.containsKey('a')&&map.containsKey('b')&&map.containsKey('l')&&map.containsKey('o')&&map.containsKey('n')){
            if(map.get('b')>=1&&map.get('a')>=1&&map.get('l')>=2&&map.get('o')>=2&&map.get('n')>=1){
                map.put('b',map.get('b')-1);
                map.put('a',map.get('a')-1);
                map.put('l',map.get('l')-2);
                map.put('o',map.get('o')-2);
                map.put('n',map.get('n')-1);
                ans++;
            }
            else return ans;
            }
            else return ans;
        }
    
    }
}