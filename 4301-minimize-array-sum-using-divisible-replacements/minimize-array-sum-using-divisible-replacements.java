class Solution {
    public long minArraySum(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        if(a[0]==1) return n;
        boolean prime[]=fun();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(prime[a[i]]) continue;
            if(map.containsKey(a[i])){
                a[i]=map.get(a[i]);
                continue;
            }
            for(int j=0;j<i;j++){
                if(i!=j&&a[i]%a[j]==0){
                    a[i]=a[j];
                    map.put(a[i],a[j]);
                    break;
                }
            }
        }
        long sum=0;
        for(int i=0;i<n;i++) sum=sum+a[i];
        return sum;
    }
    public static boolean[] fun(){
        boolean prime[]=new boolean[100001];
        Arrays.fill(prime,true);
        int n=prime.length;
        prime[0]=false;prime[1]=false;
        for(int i=2;i*i<n;i++){
            if(prime[i]){
                for(int j=i*i;j<n;j+=i) prime[j]=false;
            }
        }
        return prime;
    }
}