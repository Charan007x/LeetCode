class Solution {
    public int canBeTypedWords(String s, String t) {
        int n =s.length();
        List<String>list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch!=' ')sb.append(ch);
            if(ch==' '||i==n-1){
                list.add(sb.toString());
                sb=new StringBuilder();
            }
        }
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<t.length();i++) set.add(t.charAt(i));
        int count=0;
        for(int i=0;i<list.size();i++){
            int m=list.get(i).length();
            boolean flag =true;
            for(int j=0;j<m;j++){
                char ch=list.get(i).charAt(j);
                if(set.contains(ch)) flag=false;
            }
            if(flag) count++;
        }
        return count;
    }
}