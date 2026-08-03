class Solution {
    public long minInitialStrength(int[] a, int[][] b) {
        int n=a.length;
        long bon[]=new long[n];
        HashMap<Integer,Long> lm=new HashMap<>();
        HashMap<Integer,Long> rm=new HashMap<>();
        long sum=0;
        for(int i=0;i<n;i++) sum+=(long)(a[i]);
        for(int i=0;i<b.length;i++){
            lm.put(b[i][0],lm.getOrDefault(b[i][0],(long)0)+(long)b[i][2]);
            rm.put(b[i][1],rm.getOrDefault(b[i][1],(long)0)+(long)b[i][2]);
        }
        long bonus=0;
        for(int i=0;i<n;i++){
            if(lm.containsKey(i)) bonus+=lm.get(i);
            bon[i]=bonus;
            if(rm.containsKey(i)) bonus-=rm.get(i);
        }
        long ans=0;
        long l=0,h=sum;
        while(l<=h){
            long m=l+(h-l)/2;
            if(fun(a,bon,m)){
                ans=m;
                h=m-1;
            }else l=m+1;
        }
        return ans;
    }
    public static boolean fun(int a[],long bon[],long str){
        int n=a.length;
        for(int i=0;i<n;i++){
            if(str+bon[i]>=(long)(a[i])){
                str-=a[i];
                if(str<0) str=0;
            }
            else return false;
        }
        return true;
    }
}