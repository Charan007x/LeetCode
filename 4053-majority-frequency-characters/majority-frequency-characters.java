class Solution {
    public String majorityFrequencyGroup(String s) {
      int n = s.length();
      HashMap<Character,Integer> freq= new HashMap<>();
      for(int i=0;i<n;i++){
        char ch = s.charAt(i);
freq.put(ch,freq.getOrDefault(ch,0)+1);
      }
      HashMap<Integer,String> map = new HashMap<>();
      for(char key:freq.keySet()){
int x=freq.get(key);
if(map.containsKey(x)){
    StringBuilder sb = new StringBuilder(map.get(x));
    sb.append(key);
    map.put(x,sb.toString());
}
else{
    StringBuilder sb=new StringBuilder("");
    sb.append(key);
    map.put(x,sb.toString());
}
      }
    String ans="";
    int len=0;
    int k=0;
    for(int key:map.keySet()){
        if(map.get(key).length()==len&&key>k){
            ans=map.get(key);
            k=key;
        }
        else if(map.get(key).length()>len){
            len=map.get(key).length();
            ans=map.get(key);
            k=freq.get(ans.charAt(0));
        }
    }
    return ans;
    }
}