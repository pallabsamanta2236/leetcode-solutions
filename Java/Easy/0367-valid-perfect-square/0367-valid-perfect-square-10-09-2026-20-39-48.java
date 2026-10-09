class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1; 
        long right = num;

        while(left <= right){
            long mid = left + (right - left ) / 2;
            long squre = mid * mid ;

            if( squre == num ){
                return true;
            }
            else if( squre < num){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        return false;
    }
}