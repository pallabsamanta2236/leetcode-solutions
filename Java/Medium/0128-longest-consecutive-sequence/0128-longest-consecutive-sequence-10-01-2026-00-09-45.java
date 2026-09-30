class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashSet<Integer> newarr = new HashSet<>();
        for(int num : nums){
            newarr.add(num);
        }
     
        int maxlen  = 0; 

        for(int num : newarr){
            if(!newarr.contains(num - 1)){
                int CurrNum = num;
                int currStreak = 1;
                
                while(newarr.contains(CurrNum +1)){
                    CurrNum += 1;
                    currStreak += 1; 
                }
                maxlen = Math.max(maxlen , currStreak);
            }
        }
        return maxlen;
    }
}