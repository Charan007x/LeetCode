class Spreadsheet {
    HashMap<String,Integer> map;
    public Spreadsheet(int rows) {
        map=new HashMap<>();
    }
    
    public void setCell(String cell, int val) {
        map.put(cell,val);
    }
    
    public void resetCell(String cell) {
        map.put(cell,0);
    }
    
    public int getValue(String s) {
        int n=s.length();
        String x="",y="";
        boolean flag1=true,flag2=true;
        int i=1;
        int val1=0,val2=0;
        while(s.charAt(i)!='+'){
            char ch=s.charAt(i);
            x=x+ch;
            if(Character.isAlphabetic(ch)) flag1=false;
            i++;
        }
        i++;
        while(i<s.length()){
            char ch=s.charAt(i);
            y=y+ch;
           if(Character.isAlphabetic(ch)) flag2=false;
            i++; 
        }
        if(flag1) val1=Integer.parseInt(x);
        else if(map.containsKey(x)) val1=map.get(x);

        if(flag2) val2=Integer.parseInt(y);
        else if(map.containsKey(y)) val2=map.get(y);

        return val1+val2;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */