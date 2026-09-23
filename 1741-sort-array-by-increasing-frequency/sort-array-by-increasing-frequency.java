class Solution {
    public int[] frequencySort(int[] a) {
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        n=map.size();
        int c[]=new int[n];
        int d[]=new int[n];
        int x=0;
        for(int key:map.keySet()){
            c[x]=key;
            d[x]=map.get(key);
            x++;
        }
        Integer[] idx=new Integer[n];
        for(int i=0;i<n;i++) idx[i]=i;
        Arrays.sort(idx,(i,j)->{
            if(d[i]==d[j]) return c[j]-c[i];
            return d[i]-d[j];
        });
        int p[]=new int[n];
        int q[]=new int[n];
        for(int i=0;i<n;i++){
            p[i]=c[idx[i]];
            q[i]=d[idx[i]];
        }
        x=0;
        int i=0;
        while(i<a.length){
            int count=q[x];
            while(count-->0){
                a[i++]=p[x];
            }
            x++;
        }
        return a;
    }
}