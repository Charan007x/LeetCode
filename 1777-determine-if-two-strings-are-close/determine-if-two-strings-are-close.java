class Solution {
    public boolean closeStrings(String s, String t) {
        int m=s.length(),n=t.length();
        if(m!=n) return false;
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            a[ch1-'a']++;b[ch2-'a']++;
        }
        for(int i=0;i<26;i++){
            if((a[i]>0&&b[i]==0)||(a[i]==0&&b[i]>0)) return false;
        }
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<26;i++){
            int x=a[i],y=b[i];
            if(a[i]!=0){
                map1.put(a[i],map1.getOrDefault(a[i],0)+1);
            }
            if(b[i]!=0){
                map2.put(b[i],map2.getOrDefault(b[i],0)+1);
            }
        }
        return (map1.equals(map2));
    }
}