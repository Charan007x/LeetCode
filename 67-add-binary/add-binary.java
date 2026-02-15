class Solution {
    public String addBinary(String a, String b) {
        int m=a.length();
        int n=b.length();
        int i=m-1,j=n-1,carry=0,val=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0||j>=0||carry==1){
            val=0;
            if(i>=0){
                val+=a.charAt(i)-'0';
            }
            if(j>=0){
                val+=b.charAt(j)-'0';
            }
            if(carry==1){
                if(val==2){
                    sb.append(1);
                }else if(val==1){
                    sb.append(0);
                }else if(val==0){
                    sb.append(1);
                    carry--;
                }
            }else if(carry==0){
                if(val==2){
                    carry++;
                    sb.append(0);
                }else{
                    sb.append(val);
                }
            }
            i--;j--;
        }
        return sb.reverse().toString();
    }
}