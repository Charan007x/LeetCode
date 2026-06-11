class Solution {
    public int minTimeToType(String s) {
        int n=s.length();
        int count=0,curr=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int tar=ch-'a',idx=curr;
            if(curr==tar) count++;
            else if(idx>tar){
                int right=(25-idx)+(tar+1);
                int left=(idx-tar);
                count+=(Math.min(left,right));
                count++;
            }
            else{
                int right=(tar-idx);
                int left=(idx+1)+(25-tar);
                count+=(Math.min(left,right));
                count++;
            }
            curr=tar;
        }
        return count;
    }
}