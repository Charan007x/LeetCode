class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int a[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=ch-97;
            a[idx]+=1;
        }
        int y=-1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            int x=a[i];
            if(x%2!=0) y=i;
            x/=2;
            while(x-->0){
                sb.append((char)(97+i));
            }
        }
        for(int i=0;i<26;i++){
            int x=a[i];
            if(i==y){
                sb.append((char)(97+i));
            }
        }
        for(int i=25;i>=0;i--){
            int x=a[i];
            x/=2;
            while(x-->0){
                sb.append((char)(97+i));
            }
        }
        return sb.toString();
    }
}