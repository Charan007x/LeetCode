public class Codec {
    HashMap<String,String> map=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String inp) {
        String s="";
        for(int i=0;i<=7;i++){
            int x=((int)(Math.random()))%112;
            s=s+(char)(x);
        }
        map.put(s,inp);
        return s;
    }
    
    // Decodes a shortened URL to its original URL.
    public String decode(String inp) {
        return map.get(inp);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));