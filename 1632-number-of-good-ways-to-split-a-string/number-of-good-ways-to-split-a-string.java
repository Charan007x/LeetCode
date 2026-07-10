class Solution {
    public int numSplits(String s) {
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            set.add(ch);
            x[i]=set.size();
        }
        set=new HashSet<>();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            set.add(ch);
            y[i]=set.size();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            if(x[i]==y[i+1]) count++;
        }
        return count;
    }
}