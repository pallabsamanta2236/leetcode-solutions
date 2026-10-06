class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> bracket = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                bracket.push(i);
            }
            else if(c == '*'){
                star.push(i);
            }else{
                if(!bracket.isEmpty()){
                    bracket.pop();
                }else if(!star.isEmpty()){
                    star.pop();
                }else{
                    return false;
                }
            }
        }
        while(!bracket.isEmpty() && !star.isEmpty()){
            if(bracket.pop()> star.pop()){
                return false;
            }
        }

        return bracket.isEmpty();
    }
}