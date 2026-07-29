class Solution {
    public int numberOfAlternatingGroups(int[] a, int k) {
        int n=a.length;
        int b[]=new int[2*n];
        for(int i=0;i<2*n;i++){
            b[i]=a[i%n];
        }
        int count=0;
        for(int i=1;i<=n;i++){
            boolean flag=true;
            for(int j=i;j<i+k-1;j++){
                if(b[j]==b[j-1]){
                    // fail
                    flag=false;
                    break;
                }
            }
            if(!flag) continue;
            if(flag&&i<=n) count++;
            int l=i-1,h=i+k-1;
            while(h<2*n&&l<n-1){
                if(b[h]==b[h-1]){
                    i=h-1;
                    break;
                }
                else{
                    if(l<n-1){
                        l++;
                        i=l+1;
                    h++;
                    count++;
                    }else break;
                }
            }
        }
        return count;
    }
}