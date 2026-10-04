class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int d1 =0;
        int d2 = 0;
      
        int[] res = new int[num1.length()+num2.length()];

        for(int i =  num1.length()-1; i>=0; i--){
            d1 =num1.charAt(i) -'0';
            for(int j = num2.length()-1; j>=0; j--){
                d2 = num2.charAt(j) -'0';
                res[i+j+1] += d1* d2;
                
            }
        }
        for(int i=res.length-1; i>0; i--){
            res[i-1]+=res[i]/10;
            res[i]=res[i]%10;
        }

        StringBuilder sb = new StringBuilder();
        for(int digit : res){
            if(sb.length()== 0 && digit == 0){
                continue;
            }
      
            sb.append((char)('0'+digit));
        }
        return sb.toString();
    }
}