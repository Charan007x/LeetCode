class Solution {
    public boolean areAlmostEqual(String s, String t) {
        int m=s.length(),n=s.length();
        if(m!=n) return false;
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i),ch2=t.charAt(i);
            a[ch1-'a']++;b[ch2-'a']++;
        }
        if(!Arrays.equals(a,b)) return false;
        int count=0;
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i),ch2=t.charAt(i);
            if(ch1!=ch2) count++;
        }
        if(count==0||count==2) return true;
        return false;
    }
}