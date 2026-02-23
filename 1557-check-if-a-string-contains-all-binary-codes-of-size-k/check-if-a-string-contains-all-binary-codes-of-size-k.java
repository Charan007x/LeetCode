class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
        HashSet<String> set = new HashSet<>();
        int l=0,h=k;
        int tar=(int)Math.pow(2,k);
        while(h<=n){
            String t=s.substring(l,h);
            set.add(t);
            l++;h++;
        }
        return (set.size()==tar?true:false);
    }
}