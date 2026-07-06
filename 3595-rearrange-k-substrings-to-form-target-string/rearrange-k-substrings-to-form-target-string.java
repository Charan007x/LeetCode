class Solution {
    public boolean isPossibleToRearrange(String s, String t, int kk) {
        int n=s.length();
        int k=n/kk;
        if(k==1) return true;
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        StringBuilder p=new StringBuilder();
        StringBuilder q =new StringBuilder();
        for(int i=0;i<n;i++){
            p.append(s.charAt(i));
            q.append(t.charAt(i));
            if((i+1)%k==0){
                String x=p.toString(),y=q.toString();
                map1.put(x,map1.getOrDefault(x,0)+1);
                map2.put(y,map2.getOrDefault(y,0)+1);
                p=new StringBuilder();
                q=new StringBuilder();
            }
        }
        return (map1).equals(map2);
    }
}