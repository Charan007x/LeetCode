class Solution {
    public int minSteps(String s, String t) {
        int n=s.length();
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i),ch2=t.charAt(i);
            a[ch1-'a']++;b[ch2-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            count+=Math.abs(a[i]-b[i]);
        }
        return count/2;
    }
}