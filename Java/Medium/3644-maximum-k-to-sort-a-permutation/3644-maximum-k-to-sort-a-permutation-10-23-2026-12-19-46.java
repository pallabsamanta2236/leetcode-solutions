class Solution {
    public int sortPermutation(int[] nums) {
        boolean foundMisplaced = false;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {            
                if (!foundMisplaced) {
                    result = nums[i];      
                    foundMisplaced = true;
                } else {
                    result = result & nums[i];  
                }
            }
        }
        return result;  
    }
}