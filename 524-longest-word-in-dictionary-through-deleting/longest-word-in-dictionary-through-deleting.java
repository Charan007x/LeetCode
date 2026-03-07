class Solution {
    public String findLongestWord(String s, List<String> list) {
        int m=s.length();
        String ans="";
        int max=0;
        for(int i=0;i<list.size();i++){
            int l=0,h=0;
            String t=list.get(i);
            int n=t.length();

        while(l<m&&h<n){
            if(s.charAt(l)==t.charAt(h)){
                l++;h++;
            }else l++;
        }

        if(h==n){
            if(n>max){
                ans=t;
                max=n;
            }else if(max==n){
                ans=(ans.compareTo(t)>0?t:ans);
            }
        }

        }
        return ans;
    }
}