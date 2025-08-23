class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(!map.containsKey(s)) map.put(s,new ArrayList<>());
            map.get(s).add(strs[i]);
        }
        for(String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}