class Solution {
    public boolean buddyStrings(String s, String t) {
        int m=s.length(),n=t.length();
        if(m!=n) return false;
        int a[]=new int[26];
        int b[]=new int[26];
        boolean flag=false;
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i),ch2=t.charAt(i);
            a[ch1-'a']++;b[ch2-'a']++;
            if(a[ch1-'a']==2) flag=true;
        }
        if(!Arrays.equals(a,b)) return false;
        int count=0;
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i),ch2=t.charAt(i);
            if(ch1!=ch2) count++;
        }
        if(count==2||(count==0&&flag)) return true;
        return false;
    }
}