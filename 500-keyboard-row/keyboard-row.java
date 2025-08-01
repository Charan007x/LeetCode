class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> set3 = new HashSet<>();
        String s1="qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        for(int i=0;i<s1.length();i++) set1.add(s1.charAt(i));
        for(int i=0;i<s2.length();i++) set2.add(s2.charAt(i));
        for(int i=0;i<s3.length();i++) set3.add(s3.charAt(i));
        int n = words.length;
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=0,y=0,z=0;
            String s = words[i];
            for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
                if(set1.contains(Character.toLowerCase(ch))) x++;
                else if(set2.contains(Character.toLowerCase(ch))) y++;
                else if(set3.contains(Character.toLowerCase(ch))) z++;               
            }
            if((x>0&&y==0&&z==0)||(x==0&&y>0&&z==0)||(x==0&&y==0&&z>0)) list.add(words[i]);
        }
            String ans[] = new String[list.size()];
            int l=0;
            for(String k: list) {
                ans[l]=k;
                l++;
            }
            return ans;
    }
}