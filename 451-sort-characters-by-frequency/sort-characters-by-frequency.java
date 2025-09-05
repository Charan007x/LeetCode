class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
PriorityQueue <Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
    for(Map.Entry<Character,Integer> x:map.entrySet()) pq.add(x);
    StringBuilder sb = new StringBuilder();
       while(pq.size()>0){
            char ch = pq.peek().getKey();
            int k = pq.poll().getValue();
            while(k-->0){
                sb.append(ch);
            }
       }
       return sb.reverse().toString();
    }
}