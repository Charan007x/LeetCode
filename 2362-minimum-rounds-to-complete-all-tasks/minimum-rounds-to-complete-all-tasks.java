class Solution {
    public int minimumRounds(int[] a) {
        int n =a.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(a[i],map.getOrDefault(a[i],0)+1);
        int ans=0;
        for(int key:map.keySet()){
            int x=map.get(key);
            if(x%3==0){
                ans+=x/3;
                x=0;
            }
            if(x%3==1&&x>4){
                int y=x-4;
                ans+=(y/3);
                x=4;
            }
            if(x%3==2&&x>2){
                int y=x-2;
                ans+=y/3;
                x=2;
            }
            if(x%2==0){
                ans+=x/2;
                x=0;
            }
            if(x%2==1) return -1;
        }
        return ans;
    }
}