class Solution {
    public int minOperations(int[] a, int[] b) {
        int m=a.length,n=b.length;
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++) set.add(b[i]);
        for(int x:set) list.add(x);
        int gcd=list.get(0);
        for(int i=1;i<list.size();i++){
            gcd=fun(gcd,list.get(i));
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++) map.put(a[i],map.getOrDefault(a[i],0)+1);
        list=new ArrayList<>();
        for(int x:map.keySet()) list.add(x);
        Collections.sort(list);
        int count=0;
        for(int i=0;i<list.size()&&list.get(i)<=gcd;i++){
            if(gcd%list.get(i)!=0){
                count+=map.get(list.get(i));
            } else return count;
        }
        return -1;
    }
    public static int fun(int x,int y){
        int a=Math.max(x,y);
        int b=Math.min(x,y);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}