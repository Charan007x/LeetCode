class Solution {
    public String longestWord(String[] a) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<a.length;i++) set.add(a[i]);
        String ans="";
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--){
            String s=a[i];
            boolean flag=true;
            if(s.length()>=ans.length()){
            for(int j=s.length();j>0;j--){
                if(!set.contains(s.substring(0,j))) flag=false;
            }
            if(flag){
                if(s.length()==ans.length()){
                    if(s.compareTo(ans)<0){
                        ans=s;
                    }
                }else if(s.length()>ans.length()){
                    ans=s;
                }
            }
        }
        }
        return ans;
    }
}