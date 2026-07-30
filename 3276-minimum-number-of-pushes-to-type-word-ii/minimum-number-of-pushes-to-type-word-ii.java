class Solution {
    public int minimumPushes(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        int n=map.size();
        Integer[] idx=new Integer[n];
        for(int i=0;i<n;i++) idx[i]=i;
        int a[]=new int[n];
        int b[]=new int[n];
        int j=0;
        for(char key:map.keySet()){
            a[j]=key-'a';
            b[j]=map.get(key);
            j++;
        }
        Arrays.sort(idx,(x,y)->{
            if(b[x]==b[y]) return b[x]-b[y];
            return b[x]-b[y];
        });

        int c[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=a[idx[i]]; // val
            d[i]=b[idx[i]]; // freq
        }
        int count=0,ans=0,t=1;
        for(int i=n-1;i>=0;i--){
            count++;
            ans+=(d[i]*t);
            if(count%8==0) t++;
        }
        return ans;
    }
}