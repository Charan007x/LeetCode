class Solution {
    public int countRatioSubarrays(int[] arr, int a, int b) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int x=0,y=0;
            for(int j=i;j<n;j++){
                if(arr[j]%2==0) x++;
                else y++;
                if(y!=0&&x*b<=a*y) count++;
            }
        }
        return count;
    }
}