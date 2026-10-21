class Solution {
    public int sumCounts(List<Integer> nums) {
        int totalsum = 0;
        int n = nums.size();

        for(int i =0 ;i< n ; i++){
            HashSet<Integer> distEle = new HashSet<>();
            for(int j = i ; j< n ; j++){
                distEle.add(nums.get(j));
                int disCount = distEle.size();
                totalsum += disCount * disCount;
            }
        }
        return totalsum;
    }
}