class Solution {
    public int maximumLength(int[] a) {
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++) map.put(a[i],map.getOrDefault(a[i],0)+1);
        int max=1;
        if(map.containsKey(1)){
            int count=map.get(1);
            if(count%2==1) max=Math.max(max,count);
            else max=Math.max(max,count-1);
        }
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int key:map.keySet()){
            if(key!=1) list.add(key);
        }
        for(int i=0;i<list.size();i++){
            int key=list.get(i);
            int count=0;
            boolean flag=true;
            int x=1,y=1,last=0;
            while(flag){
                int val=(int)(Math.pow(key,x));
                if(map.containsKey(val)){
                    int freq=map.get(val);
                    if(last!=1&&freq>=2){
                        count+=2;
                        last=2;
                    }else if(freq==1){
                        if(last==1){
                           max=Math.max(count,max);
                            break; 
                        }
                        count++;
                        last=1;
                    }
                }else {
                    if(last==2)count--;
                    max=Math.max(count,max);
                    break;
                }
                x=(int)(Math.pow(2,y));
                y++;
            }
        }
        return max;
    }
}