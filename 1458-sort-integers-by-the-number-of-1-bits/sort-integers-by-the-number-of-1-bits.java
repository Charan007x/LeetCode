class Solution {
    public int[] sortByBits(int[] a) {
        int n=a.length;
        Integer idx[]=new Integer[n];
        for(int i=0;i<n;i++) idx[i]=i;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            String s=Integer.toString(a[i],2);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1') count++;
            }
            b[i]=count;
        }
        Arrays.sort(idx,(i,j)->{
            if(b[i]!=b[j]){
                return b[i]-b[j];
            }return a[i]-a[j];
        });
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=a[idx[i]];
        }
        return ans;
    }
}