class Node{
    Node[] children;
    boolean isEnd;
    Node(){
        children=new Node[26];
        isEnd=false;
    }
}
class WordDictionary {
    Node root;
    public WordDictionary() {
        root=new Node();
    }
    
    public void addWord(String s) {
        Node temp=root;
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            if(temp.children[idx]==null){
                temp.children[idx]=new Node();
            }
            temp=temp.children[idx];
        }
        temp.isEnd=true;
    }
    
    public boolean search(String s) {
        return fun(s,0,root);
    }
    public boolean fun(String s,int n,Node temp){
        if(n==s.length()) return temp.isEnd;
        char ch=s.charAt(n);
        int idx=ch-'a';
        boolean left=false,right=false;
        if(ch=='.'){
            for(int i=0;i<26;i++){
                if(temp.children[i]!=null){
                    left=left||fun(s,n+1,temp.children[i]);
                }
            }
        }else{
            if(temp.children[idx]==null) return false;
            right=fun(s,n+1,temp.children[idx]);
        }
        return left||right;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */