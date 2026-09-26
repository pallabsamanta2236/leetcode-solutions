class Solution {
    public int squreSum(int n){
        int sum =0; 
        while(n > 0){
            int digit = n % 10;
            int sqr = digit * digit;
            sum += sqr;
            n = n /10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            int ans = squreSum(n);
            n = ans;
        }
        return n ==1;
    }
}