class Solution {
    public int bagOfTokensScore(int[] a, int k) {
        int n=a.length;
        Arrays.sort(a);
        int l=0,h=n-1,count=0;
        while(l<=h){
            if(k>=a[l]){
                k-=a[l];
                count++;
                l++;
            }else{
                if(l!=h){
                    if(a[h]+k>=a[l]&&count>0){
                        k=k+a[h]-a[l];
                        l++;
                        h--;
                    }else break;
                }else break;
            }
        }
        return count;
    }
}