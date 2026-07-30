class Node{
    Node[] children;
    boolean isEnd;
    Node(){
        children=new Node[26];
        isEnd=false;
    }
}

class Trie {
    Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String s) {
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
        Node temp=root;
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            if(temp.children[idx]==null){
                return false;
            }
            temp=temp.children[idx];
        }
        return temp.isEnd;
    }
    
    public boolean startsWith(String s) {
        Node temp=root;
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            if(temp.children[idx]==null){
                return false;
            }
            temp=temp.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */