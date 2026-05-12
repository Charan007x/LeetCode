class Solution {
    public long numberOfWays(String s) {
        int n=s.length();
        int z=0,o=0;
        int p[]=new int[n]; //one
        int q[]=new int[n]; //zero
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                o++;
            }else z++;
            p[i]=o;q[i]=z;
        }
        long ans=0;
        for(int i=1;i<=n-2;i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                if(q[i]>0&&z-q[i]>0)ans+=(q[i]*(long)(z-q[i]));
            }else{
                if(p[i]>0&&o-p[i]>0)ans+=(p[i]*(long)(o-p[i]));
            }
        }
        return ans;
    }
}