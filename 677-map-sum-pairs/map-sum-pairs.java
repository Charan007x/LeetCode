class Node{
    Node [] children;
    boolean isEnd;
    int sum;
    Node(){
        children=new Node[26];
        isEnd=false;
        sum=0;
    }
}
class MapSum {
    Node root;
    HashMap<String,Integer> map;
    public MapSum() {
        root=new Node();
        map=new HashMap<>();
    }
    
    public void insert(String key, int val) {
       Node temp=root;
       for(char ch:key.toCharArray()){
        int idx=ch-'a';
        if(temp.children[idx]==null){
            temp.children[idx]=new Node();
        }
        int x=0;
        if(map.containsKey(key)) x=map.get(key);
        temp=temp.children[idx];
        temp.sum-=x;
        temp.sum+=val;
       } 
       map.put(key,val);
       temp.isEnd=true;
    }
    
    public int sum(String s) {
        Node temp=root;
        for(char ch:s.toCharArray()){
           int idx=ch-'a';
           if(temp.children[idx]==null) return 0;
           temp=temp.children[idx]; 
        }
        return temp.sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */