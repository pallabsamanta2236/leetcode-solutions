class Solution {
    public int titleToNumber(String s) {
        int n = s.length();
        int total = 0;
        for(int i=0;i<n;i++){
            total = total* 26 +(s.charAt(i) - 'A' +1);
        }
        return total;
    }
}